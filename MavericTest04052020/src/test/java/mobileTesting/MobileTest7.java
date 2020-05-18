package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest7 {
	public static AndroidDriver<MobileElement> driver = null;
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		//DesiredCapabilities cap = new DesiredCapabilities();
		
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "vivo 1606");
			cap.setCapability("udid", "37655905");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "6.0.1");
			cap.setCapability("automationName", "UiAutomator1");
			cap.setCapability("appPackage", "com.wt.apkinfo");
			cap.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");
			Thread.sleep(3000);
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
			System.out.println("Application invoked Successfully");
			Thread.sleep(3000);
			//driver.findElementById("com.dmitrybrant.android.multitouch:id/btnAbout").click();

					}

	}

}
