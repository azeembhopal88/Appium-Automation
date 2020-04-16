package selendroid.TestMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AndroidDriver capabilities() throws MalformedURLException {
		
			
		File appDir=new File("src/test/resources");
		File app = new File(appDir, "selendroid-test-app-0.17.0.apk");
		
		
		DesiredCapabilities cap=new DesiredCapabilities(); 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_S_API_27");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    AndroidDriver driver=new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    
	    return driver;
}
	
}