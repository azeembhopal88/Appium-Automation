package selendroid.Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import selendroid.PageObjects.HomeScreenPage;
import selendroid.PageObjects.TouchActionPage;
import selendroid.TestMethods.BaseClass;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class TouchActionTest extends BaseClass {

//	Verify the long press action works fine and display the message when user long press
	@Test
	public void verifyLongPress() throws IOException {
	AndroidDriver<AndroidElement> driver = capabilities();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	HomeScreenPage homepage=new HomeScreenPage(driver);
	homepage.clickAction();
	
	TouchActionPage actionpage= new TouchActionPage(driver);
	TouchAction action=new TouchAction(driver);
	action.longPress(element(actionpage.actionelement)).perform();
	String actual_action_message= actionpage.getActionMessage();
	Assert.assertEquals(actual_action_message, actionpage.expected_action_message);
	
	
}
	

}
