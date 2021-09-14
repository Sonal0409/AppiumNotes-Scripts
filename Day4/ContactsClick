package day4;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class ContactsDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus5");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	
		MobileElement m2= (MobileElement) ((FindsByAndroidUIAutomator)driver)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
				".scrollIntoView(new UiSelector().text(\"Y2\"))");
	
		List<MobileElement> contacts= driver.findElementsByClassName("android.widget.TextView");
	
		int size1= contacts.size();
		System.out.println(size1);
		
		for(int i=0; i<size1;i++)
		{
		   
		   
			if(contacts.get(i).getText().equalsIgnoreCase("Y2"))
			{
				System.out.println(contacts.get(i).getText());
				contacts.get(i).click();
				break;
			}
		}
		
		Thread.sleep(2000);
	      driver.findElementsById("com.android.contacts:id/icon").get(0).click();
	      
	      Thread.sleep(10000);
	      
	  	TouchAction ta= new TouchAction(driver);
		
		ta.tap(PointOption.point(521, 1598)).perform();
		
	
	
	
	
	
	
	}

}
