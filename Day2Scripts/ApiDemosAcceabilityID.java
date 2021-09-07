package day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosAcceabilityID {
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoSonal");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//cap.setCapability("appActivity", "io.appium.android.apis.preference.SwitchPreference");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		// Locate preference with Accessability id locator
		
		driver.findElementByAccessibilityId("Preference").click();
		
		//Locate preference dependencies
		
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
