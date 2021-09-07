//example for checkbox & switches



package day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosID {

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
		
		// Click on preference
		
		driver.findElementsById("android:id/text1").get(9).click();
		
		//click on Switch in next screen
		
		driver.findElementsById("android:id/text1").get(8).click();
		
		//click on checkbox
		
		driver.findElementById("android:id/checkbox").click();
		
		//click on Switch
		
		driver.findElementsById("android:id/switch_widget").get(0).click();
		
		//After this show :
		
		
		String output2=driver.findElementById("android:id/checkbox").getAttribute("checked");
		Thread.sleep(2000);
		System.out.println("is it selected now"+output2);
		
		String text=	driver.findElementsById("android:id/switch_widget").get(0).getAttribute("text");
		System.out.println("Is the Switch ON or OFF?" + text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
