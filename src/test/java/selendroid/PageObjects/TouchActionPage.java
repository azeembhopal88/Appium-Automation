package selendroid.PageObjects;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;

public class TouchActionPage {

    
	public AndroidDriver driver;
	public static String expected_action_message="LONG PRESS";
	
	public TouchActionPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/scale_factor_text_view']")
	public static WebElement actionelement;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/gesture_type_text_view']")
	public static WebElement actionmessage;

	public String getActionMessage() {
		return actionmessage.getText();
	}
	
}
	