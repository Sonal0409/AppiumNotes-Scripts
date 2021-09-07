//Example for checkbox & text field


package day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosXpath {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		//Locate preference dependencies
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		//locate checkbox
		
		driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
		
		Thread.sleep(3000);
		//get the xpath value by clicking on the xml file..child tags 
		
		driver.findElementByXPath("//*[@text='WiFi settings']").click();
		
		Thread.sleep(2000);
		
		//get the xpath value by clicking on the xml file..child tags 
		
		driver.findElementByXPath("//*[@resource-id='android:id/edit']").sendKeys("Sonal");
		
	}
}
