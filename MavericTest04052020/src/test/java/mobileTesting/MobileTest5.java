package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest5 
{

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
				cap.setCapability("appPackage", "org.wordpress.android");
				cap.setCapability("appActivity", "org.wordpress.android.ui.posts.PostsActivity");
				Thread.sleep(3000);

				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
				System.out.println("Application invoked Successfully");
				Thread.sleep(3000);
				driver.findElementById("org.wordpress.android:id/login_button").click();
				MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
		        el1.click();
		        MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		        el2.click();
		        
		        Thread.sleep(3000);
		        
		        MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Roopa Kubasad\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]");
		        el3.click();
		        MobileElement el4 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
		        el4.click();
		        MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
		        el5.sendKeys("Maks2020!");
		        MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
		        el6.click();
			}
		}
	}
}