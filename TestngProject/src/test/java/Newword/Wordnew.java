package Newword;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Wordnew {

  private AndroidDriver driver;

  @BeforeMethod
public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("deviceName", "Mi A1");
    desiredCapabilities.setCapability("udid", "33c041340704");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("platformVersion", "9");
    desiredCapabilities.setCapability("automationName", "UiAutomator1");
    desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
    desiredCapabilities.setCapability("appActivity", "org.wordpress.android.ui.posts.PostsActivity");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
    System.out.println("wordpress Launched successfully");
    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void Mycode() throws Exception {
    MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/create_site_button");
    el1.click();
    Thread.sleep(4000);
    MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/signup_email");
    el2.click();
    Thread.sleep(4000);
    MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
    el3.click();
    Thread.sleep(4000);
    MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
    el4.click();
    Thread.sleep(4000);
    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
    el5.sendKeys("susilamaheswari@gmail.com");
    Thread.sleep(4000);
    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
    el6.click();
    Thread.sleep(4000);
    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
    el7.click();
    Thread.sleep(4000);
    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
    el8.sendKeys("Monika10#");
    Thread.sleep(4000);
    MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
    el9.click();
    Thread.sleep(4000);
    MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
    el10.click();
    Thread.sleep(4000);
    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Reader. Follow content from other sites.");
    el11.click();
    MobileElement el12 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
    el12.click();
    Thread.sleep(4000);
    MobileElement el13 = (MobileElement) driver.findElementById("org.wordpress.android:id/filter_list_button");
    el13.click();
    Thread.sleep(4000);
    MobileElement el14 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Select a Tag or Site, Pop Up Window\"]/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    el14.click();
    Thread.sleep(4000);
    MobileElement el15 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"discover\"]/android.widget.TextView");
    el15.click();
    Thread.sleep(4000);
    MobileElement el16 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"likes\"]/android.widget.TextView");
    el16.click();
    Thread.sleep(4000);
    MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("saved");
    el17.click();
    Thread.sleep(4000);
    MobileElement el18 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[3]");
    el18.click();
    Thread.sleep(4000);
    MobileElement el19 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"My Site. View your site and manage it, including stats.\"]");
    el19.click();
    Thread.sleep(4000);
    MobileElement el20 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
    el20.click();
    Thread.sleep(4000);
    MobileElement el21 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"discover\"]/android.widget.TextView");
    el21.click();
 
    MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Reader. Follow content from other sites.");
    el22.click();
    Thread.sleep(4000);
    MobileElement el23 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
    el23.click();
    Thread.sleep(4000);
    MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Me");
    el24.click();
    Thread.sleep(4000);
    MobileElement el25 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
    el25.click();
    MobileElement el26 = (MobileElement) driver.findElementById("android:id/button1");
    el26.click();
 
  
  }

  @AfterMethod
public void tearDown() {
	  System.out.println("wordpress executed successfully");
    driver.quit();
  }
}
