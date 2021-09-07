package day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosTagname {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoSonal");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		//cap.setCapability("appActivity", "io.appium.android.apis.preference.SwitchPreference");
		AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		// Find Views using Class Name--> get value form attribute class
		driver.findElementsByClassName("android.widget.TextView").get(12).click();
		
		//Click on Expandable list
		
		driver.findElementsByClassName("android.widget.TextView").get(9).click();
		
		// class name will not work after this as it is not able to correctly identify the elements
		//Use other locator
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		//click on people name
		
		driver.findElementByXPath("//android.widget.TextView[@text='People Names']").click();
		
		/*
		 * //clcik on chuck
		 * 
		 * Thread.sleep(2000);
		 * driver.findElementByXPath("//android.widget.TextView[@text='Chuck']").click()
		 * ;
		 */
		
		//Fetch all the values and print it
		
		List <MobileElement> val= driver.findElementsByClassName("android.widget.TextView");
        
        for(MobileElement e:val){
        	
            String t=e.getText();
        
            //  System.out.println(t);
            
            if(t.equalsIgnoreCase("Chuck"))
            {
                e.click();
            }
          
        }
		
		
		
		
		

	}

}
