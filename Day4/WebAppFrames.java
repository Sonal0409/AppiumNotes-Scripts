package day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import com.google.common.collect.ImmutableMap;
public class WebAppFrames {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
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
		
	
	
	String text1 = driver.findElement(By.id("droppable")).getText();
	

	System.out.println(text1);

		
		
		
		
		
		

	}

}
