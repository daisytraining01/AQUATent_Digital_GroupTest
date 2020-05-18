package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest1
{
	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{

		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "vivo 1606");
			cap.setCapability("udid", "37655905");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "6.0.1");
			cap.setCapability("automationName", "UiAutomator1");

			cap.setCapability("appPackage", "com.android.bbkcalculator");
			cap.setCapability("appActivity", "com.android.bbkcalculator.Calculator");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, cap);
			System.out.println("Calculator Application invoked successfully");
			
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		    driver.findElement(By.id("com.android.bbkcalculator:id/digit5")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("com.android.bbkcalculator:id/plus")).click();
		    driver.findElement(By.id("com.android.bbkcalculator:id/digit4")).click();
		    driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();
		    WebElement sum = driver.findElement(By.id("com.android.bbkcalculator:id/edit_result_text"));
		    System.out.println("Sum is equal to" +sum);
		    //driver.findElement(By.id("com.android.bbkcalculator:id/digit4"));
		    
		    //com.android.bbkcalculator:id/edit_result_text
			
			
			/*com.android.bbkcalculator:id/digit5
			com.android.bbkcalculator:id/plus
			
			com.android.bbkcalculator:id/digit4*/
		}

	}

}
