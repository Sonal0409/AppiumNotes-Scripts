package day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ApiTAPwithRatingStars {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		
		// Click on Rating Bar
		
		Thread.sleep(3000);

		driver.findElementByAccessibilityId("Rating Bar").click();
		
		//Tap at a coordinate.
		
		TouchAction ta = new TouchAction(driver);
		
		ta.tap(new PointOption().withCoordinates(462, 440)).release().perform();
		
		

	}

}
