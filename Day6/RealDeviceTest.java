package parallelTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class RealDeviceTest {
	
public static AndroidDriver<MobileElement> driver;
	
	@Parameters({"deviceName","Version","URL"})
	@Test(priority='1')
	public void setup(String deviceName,String Version, String URL) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName",deviceName );
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", Version);
		
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL(URL),cap);

		
MobileElement e1= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]");
		
		TouchAction ta = new TouchAction(driver);
		
		//tap on Views
		
		ta.tap(ElementOption.element(e1)).release().perform();
		
	MobileElement e2 = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
	
	ta.tap(ElementOption.element(e2)).release().perform();
	
	Thread.sleep(2000);
	
	
	MobileElement drag = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
	
	MobileElement drop = driver.findElementById("io.appium.android.apis:id/drag_dot_2");
	
	ta.longPress(ElementOption.element(drag))
	.moveTo(ElementOption.element(drop))
	.release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
