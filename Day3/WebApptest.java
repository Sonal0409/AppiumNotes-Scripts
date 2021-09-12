package day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import com.google.common.collect.ImmutableMap;

public class WebApptest {

	public static AppiumDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "96352732140005T");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "11");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		
          driver.switchTo().frame(0);
		
	String text=	driver.findElement(By.id("draggable")).getText();
	
	System.out.println(text);
		
	WebElement e1=driver.findElement(By.id("draggable"));
	
	WebElement e2= driver.findElement(By.id("droppable"));
	

	
	TouchActions action = new TouchActions(driver);
	
	Thread.sleep(2000);
	
//	action.dragAndDrop(e1, e2).build().perform();
	
	
action.clickAndHold(e1).moveToElement(e2).release().build().perform();	
		
		
		
		
		
		

	}

}
