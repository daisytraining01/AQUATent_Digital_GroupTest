package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest6 {

	private static final String Accessibility = null;
	static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		{

			{
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability("deviceName", "vivo 1606");
				cap.setCapability("udid", "37655905");
				cap.setCapability("platformName", "Android");
				cap.setCapability("platformVersion", "6.0.1");
				cap.setCapability("automationName", "UiAutomator1");
				cap.setCapability("appPackage", "io.appium.android.apis");
				cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
				Thread.sleep(3000);
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
				System.out.println("Application invoked Successfully");
				Thread.sleep(3000);
				
				//Clicking on Views
				//driver.findElementByLinkText("Accessibility").click();
				//`driver.findElementByXPath("android.widget.TextView\\Text()='Accessibility'").click();
				//driver.findElementByXPath("android.widget.TextView
				//driver.findElementByCssSelector("Accessibility").click();
				
				//driver.findElement(By.xpath("//android.widget.TextView[@Text="+Accessibility+")]");
				
				
				//driver.switchTo().frame(0);
				//driver.switchTo().frame(1);
				//driver.findElementByXPath("FrameLayout[2]/ListView/TextView").click();
				driver.close();
				
				
}
		}
	}
}
