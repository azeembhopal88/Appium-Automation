package selendroid.Tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import selendroid.PageObjects.HomeScreenPage;
import selendroid.TestMethods.BaseClass;

public class ToastMsgTest extends BaseClass{

	
//	Verify the toast message when user taps on "Display a Toast" button on homescreen
	@Test	
	public void verifyToast() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		HomeScreenPage homepage= new HomeScreenPage(driver);
		homepage.clickOnButton();
		String actualToastMsg=homepage.getToastMsg();
		Assert.assertEquals(actualToastMsg, homepage.expectedToastMsg);
	
	}	
	


}
