package day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class KeyEventClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		//cap.setCapability("appActivity", "io.appium.android.apis.preference.SwitchPreference");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
TouchAction t = new TouchAction(driver);

Thread.sleep(4000);
		
driver.findElementByXPath("//android.widget.TextView[@text='Search here']").click();

Thread.sleep(2000);

driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("N");

driver.pressKey(new KeyEvent(AndroidKey.E));

driver.pressKey(new KeyEvent(AndroidKey.W));
driver.pressKey(new KeyEvent(AndroidKey.D));
driver.pressKey(new KeyEvent(AndroidKey.E));
driver.pressKey(new KeyEvent(AndroidKey.L));
driver.pressKey(new KeyEvent(AndroidKey.H));
driver.pressKey(new KeyEvent(AndroidKey.I));
driver.pressKey(new KeyEvent(AndroidKey.SPACE));


driver.pressKey(new KeyEvent(AndroidKey.ENTER));

		

	}

}
