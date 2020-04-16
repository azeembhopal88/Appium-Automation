package selendroid.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VerifyUserPage {

	public AndroidDriver driver;
	
	public VerifyUserPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/label_name_data']")
	public static WebElement actualName;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/label_username_data']")
	public static WebElement actualUsername;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/label_password_data']")
	public static WebElement actualPasword;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/label_email_data']")
	public static WebElement actualEmail;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/label_acceptAdds_data']")
	public static WebElement actualLanguage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='io.selendroid.testapp:id/label_acceptAdds_data']")
	public static WebElement actualAccept;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='io.selendroid.testapp:id/buttonRegisterUser']")
	public static WebElement button;
	
	public String getActualName() {
		return actualName.getText();
	}
	
	public String getActualUserName() {
		return actualUsername.getText();
	}
	
	public String getActualPassword() {
		return actualPasword.getText();
	}
	
	public String getActualEmail() {
		return actualEmail.getText();
	}
	
	public String getActualLanguage() {
		return actualLanguage.getText();
	}
	
	public String getAcceptanceCheck() {
		return actualAccept.getText();
	}
	
	public void clickRegister() {
		button.click();
	}
}
