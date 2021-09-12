package day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ApiSpinner {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		Thread.sleep(2000);
		//TouchAction ta;
		
		for(int i=0; i<3 ; i++)
		{
			 (new TouchAction(driver))
             .press(new PointOption().withCoordinates(507, 1679))
             .moveTo(new PointOption().withCoordinates(520, 625))
             .release()
             .perform();

		}
		Thread.sleep(2000);
		
		driver.findElementByAccessibilityId("Spinner").click();
		
		  driver.findElementById("io.appium.android.apis:id/spinner1").click();
		  
		  Thread.sleep(2000);		  
		//  driver.findElementByXPath("//*[@class='android.widget.ListView']/child::android.widget.CheckedTextView[3]").click();

		  // OR for clicking on yellow use id locator
		  
		  driver.findElementsById("android:id/text1").get(2).click();

	}

}
