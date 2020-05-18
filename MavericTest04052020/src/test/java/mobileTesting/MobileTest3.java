/*recorded script by appium inspector*/

package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest3
{
	protected AndroidDriver<MobileElement> driver = null;
	DesiredCapabilities cap = new DesiredCapabilities();

	@Test
    public void setUp() throws MalformedURLException, InterruptedException
	{
       
    	cap.setCapability("deviceName", "vivo 1606");
		cap.setCapability("udid", "37655905");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("automationName", "UiAutomator1");       
        cap.setCapability("appPackage", "com.experitest.ExperiBank");
        cap.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        System.out.println("Application invoked Successfully");
        Thread.sleep(3000);
	
	MobileElement el1 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
	el1.sendKeys("company");
	MobileElement el2 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
	el2.click();
	el2.click();
	el2.sendKeys("company");
	driver.navigate().back();
	MobileElement el3 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
	el3.click();

	}
}