package day4;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridAppTest {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "96352732140005T");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability("chromedriverExecutable", "C:\\Grid\\chromedriver.exe");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
          //   driver.findElementById("com.android.chrome:id/terms_accept").click();
             Thread.sleep(3000);
          //   driver.findElementById("com.android.chrome:id/next_button").click();
             
           //  Thread.sleep(2000);
         //  driver.findElementById("com.android.chrome:id/negative_button").click();
             
             Thread.sleep(7000);
             
             driver.findElementByXPath("//*[@text='Flipkart']").click();
             Set<String> cns=	driver.getContextHandles();
     		System.out.println(cns + "\n\n");
     		Thread.sleep(3000);
     		
     		driver.context("WEBVIEW_chrome");
     		
     		Thread.sleep(5000);
     		
     		//driver.findElementByXPath("//*[@class='css-1dbjc4n r-9kzrz9 r-u8s1d']/descendant::div[10]").click();
             
     	//	driver.findElementById("input-searchsearchpage-input").click();
     		
     		driver.findElementByXPath("//div[@class='_1FWdmb']/descendant::img[1]").click();
     		
     		Thread.sleep(5000);
     		
     		driver.findElementByXPath("//*[@id=\"container\"]/div/div[8]/div/div/div[2]/div/div[2]/div/div[12]/div/ul/div[3]/li/a/div/span").click();
     		
			/*
			 * driver.findElementByXPath("//input[@type='search']").sendKeys("books");
			 * 
			 * driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			 */
     		
     		driver.context("NATIVE_APP");
    		
    		Thread.sleep(2000);
    		driver.findElementById("com.android.chrome:id/menu_button").click();
    		
    		Thread.sleep(2000);
    		
    		driver.findElementByAccessibilityId("History").click();
             

	}

}
