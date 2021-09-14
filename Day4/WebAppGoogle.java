package day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebAppGoogle {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "96352732140005T");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "11");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
	AndroidDriver<MobileElement>	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id=\"tsf\"]/div[1]/div[1]/div[1]/div/div[1]/input").sendKeys("appium");
		

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
        Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id=\"hdtb-msb\"]/div[2]/a").click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
