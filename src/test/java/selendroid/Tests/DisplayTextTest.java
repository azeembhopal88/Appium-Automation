package selendroid.Tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import selendroid.PageObjects.HomeScreenPage;
import selendroid.TestMethods.BaseClass;

public class DisplayTextTest extends BaseClass {

//	Verify the text displayed when user cliks "Display text view" button on homescreen
	@Test	
	public void verifyText() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		HomeScreenPage homepage= new HomeScreenPage(driver);
		homepage.clickOnDisplayText();
		String actualToastMsg=homepage.getDisplayText();
		Assert.assertEquals(actualToastMsg, homepage.expectedTextMsg);
	
	}	
	

	
}
