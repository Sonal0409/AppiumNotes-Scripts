package day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragandDropDemo {

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
	 
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		// Code to find Element1
		MobileElement e1 = driver.findElementsByClassName("android.view.View").get(0);

		// Code to find Element1
		
		MobileElement e2 = driver.findElementsByClassName("android.view.View").get(1);
		

		TouchAction ta = new TouchAction(driver);
		
		// Long press Element 1 and moveTo Element2
		
		ta.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(e1))).moveTo(ElementOption.element(e2)).release().perform();
		
	//ta.press(ElementOption.element(e1)).moveTo(ElementOption.element(e2)).release().perform();	
		

	}

}
