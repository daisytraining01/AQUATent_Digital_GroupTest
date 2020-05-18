package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest4 
{
	protected static AndroidDriver<MobileElement> driver1 = null;
	DesiredCapabilities cap = new DesiredCapabilities();

	@Test
	public void setUp() throws MalformedURLException, InterruptedException
	{

		cap.setCapability("deviceName", "vivo 1606");
		cap.setCapability("udid", "37655905");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("automationName", "UiAutomator1");
		cap.setCapability("appPackage", "com.udemy.android");
		//com.udemy.android
		// com.udemy.android.login.onboarding.OnboardingActivity
		cap.setCapability("appActivity", "com.udemy.android.login.onboarding.OnboardingActivity");
		driver1 = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("Application invoked Successfully");
		Thread.sleep(3000);
		MobileElement el1 = (MobileElement) driver1.findElementByXPath(
				"//android.view.ViewGroup[@content-desc=\"Home screen 3\"]/android.view.ViewGroup/android.widget.RelativeLayout[14]/android.widget.ImageView");
		el1.click();
		Thread.sleep(3000);
		MobileElement el2 = (MobileElement) driver1.findElementById("com.udemy.android:id/browse_button");
		el2.click();
		Thread.sleep(3000);
		MobileElement el3 = (MobileElement) driver1.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[2]/android.widget.TextView[2]");
		el3.click();

	}

}
