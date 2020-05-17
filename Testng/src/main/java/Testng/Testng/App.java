package Testng.Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App {
	

  private AndroidDriver driver;

  @BeforeMethod
public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("deviceName", "honor 9i");
    desiredCapabilities.setCapability("udid", "G9UDU18205006729");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "8.0.0");
    desiredCapabilities.setCapability("automationName", "UiAutomator1");
    desiredCapabilities.setCapability("appPackage", "com.wt.apkinfo");
    desiredCapabilities.setCapability("appActivity", "com.wt.apkinfo.activities.StartActivity");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws Exception {
    MobileElement el1 = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Applications list\"]/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView[1]");
    el1.click();
    Thread.sleep(8000);
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("System Details");
    el2.click();
    Thread.sleep(4000);
    MobileElement el3 = (MobileElement) driver.findElementById("android:id/up");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Back");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementByXPath("//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Applications list\"]/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.TextView[1]");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("System Details");
    Thread.sleep(4000);
    el6.click();
    MobileElement el7 = (MobileElement) driver.findElementById("android:id/up");
    el7.click();
    MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Back");
    el8.click();
  }

  @AfterMethod
public void tearDown() {
    driver.quit();
  }
}