package selendroid.Tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import selendroid.PageObjects.HomeScreenPage;
import selendroid.PageObjects.RegistrationPage;
import selendroid.PageObjects.VerifyUserPage;
import selendroid.TestMethods.BaseClass;

public class RegistrationTest extends BaseClass {
	
	File csvDir = new File("src/test/resources");
	File csv = new File(csvDir, "Registration_Test_Data.csv");
	
//	Verify the registration form entries on review screen
	@Test
	public void verifyRegistration() throws IOException, CsvException {
	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	HomeScreenPage homepage= new HomeScreenPage(driver);
	homepage.accessFrom();	
	
	RegistrationPage page = new RegistrationPage(driver);
	CSVReader reader = new CSVReader(new FileReader(csv.getAbsolutePath()));
	String[] cell= reader.readNext();
	String[] key= new String[5];	
	for (int i=1; i<5; i++) {
		key[i]=cell[1];
		cell= reader.readNext();
	}
	
		page.inputUsername(key[1]);
		page.inputEmail(key[2]);
		driver.hideKeyboard();	
		page.inputPassword(key[3]);
		page.clearName();
		page.inputName(key[4]);
		page.clickLanguage();
		page.selectJava();
		page.acceptCheck();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Register User (verify)\"));");
		page.clickRegister();
		
		//Verify User inputs on review page
		VerifyUserPage userPage= new VerifyUserPage(driver);
		Assert.assertEquals(userPage.getActualUserName(), key[1]);
		Assert.assertEquals(userPage.getActualEmail(), key[2]);
		Assert.assertEquals(userPage.getActualPassword(), key[3]);
		Assert.assertEquals(userPage.getActualName(), key[4]);
		Assert.assertEquals(userPage.getAcceptanceCheck(), "true");
		userPage.clickRegister();
	
	}
	
}
