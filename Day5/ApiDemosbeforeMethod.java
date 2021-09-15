package testngscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ApiDemosbeforeMethod {
	
	public static AndroidDriver<MobileElement> driver;
	@BeforeMethod
	public void setup() throws MalformedURLException
	{
DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	}
	
	
	@Test(priority='1')
	public void clickDragDrop() throws InterruptedException
	{
driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		Thread.sleep(2000);
	 
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		Thread.sleep(2000);
		// Code to find Element1
		MobileElement e1 = driver.findElementsByClassName("android.view.View").get(0);

		// Code to find Element1
		
		MobileElement e2 = driver.findElementsByClassName("android.view.View").get(1);
		

		TouchAction ta = new TouchAction(driver);
		
		// Long press Element 1 and moveTo Element2
		
		ta.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(e1))).moveTo(ElementOption.element(e2)).release().perform();
		
	//ta.press(ElementOption.element(e1)).moveTo(ElementOption.element(e2)).release().perform();	
		
	}
	
	@Test(priority='2')
	public void Scroll() throws InterruptedException
	{
		
MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		
		TouchAction ta = new TouchAction(driver);
		
		//tap on Views
		
		ta.tap(ElementOption.element(e1)).release().perform();
		
		
		Thread.sleep(3000);
		
		// Scroll until the element is visible using UIAutomator framework 
		
		
		MobileElement m2= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().text(\"TextFields\"))");
		
		
		m2.click();
		

	}
	
	

}
