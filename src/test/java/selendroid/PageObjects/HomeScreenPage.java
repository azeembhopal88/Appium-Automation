package selendroid.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeScreenPage {

    
	public AndroidDriver driver;
	
	public HomeScreenPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public String expectedToastMsg="Hello selendroid toast!";
	public String expectedTextMsg="Text is sometimes displayed";
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='io.selendroid.testapp:id/showToastButton']")
	public static WebElement display_a_toast;
	
	@AndroidFindBy(xpath="//android.widget.Toast[1]")
	public static WebElement toastmessage;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@resource-id='io.selendroid.testapp:id/startUserRegistration']")
	public static WebElement registration;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='io.selendroid.testapp:id/visibleButtonTest']")
	public static WebElement display_text_view;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/visibleTextView']")
	public static WebElement display_text;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='io.selendroid.testapp:id/touchTest']")
	public static WebElement actionbutton;
	
	public void clickOnButton() {
		display_a_toast.click();
	}

	public String getToastMsg() {
		String text=toastmessage.getText();
		return text;
	}
	
	public void accessFrom() {
		registration.click();
	}
	
	public void clickOnDisplayText() {
		display_text_view.click();
	}
	
	public String getDisplayText() {
		return display_text.getText();
	}
	
	public void clickAction() {
		actionbutton.click();
	}
}