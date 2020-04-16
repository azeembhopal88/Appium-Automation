package selendroid.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.TouchAction;

public class RegistrationPage {
	
	public AndroidDriver driver;
	
	public RegistrationPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputUsername']")
	public static WebElement username;

	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputEmail']")
	public static WebElement email;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputPassword']")
	public static WebElement password;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='io.selendroid.testapp:id/inputName']")
	public static WebElement name;
	
	@AndroidFindBy(xpath="//android.widget.Spinner[@resource-id='io.selendroid.testapp:id/input_preferedProgrammingLanguage']")
	public static WebElement language;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Java']")
	public static WebElement languagemod;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@resource-id='io.selendroid.testapp:id/input_adds']")
	public static WebElement acceptcheck;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='io.selendroid.testapp:id/btnRegisterUser']")
	public static WebElement register;
	
	public void inputUsername(String s) {
		username.sendKeys(s);
	}
	
	public void inputEmail(String s) {
		email.sendKeys(s);
	}
	
	public void inputPassword(String s) {
		
		password.sendKeys(s);
	}
	
	public void clearName() {
		name.clear();
	}
	
	public void inputName(String s) {
		name.sendKeys(s);
	}
	
	public void clickLanguage() {
		language.click();
	}
	
	public void selectJava() {
		languagemod.click();
	}
	
	public void acceptCheck() {
		acceptcheck.click();
	}
	
	public void clickRegister() {
		register.click();
	}
}

