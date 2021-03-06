package mergecode;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class mergenew {

  private AndroidDriver driver;

  @BeforeMethod
public void setUp() throws MalformedURLException {
	/*
	 * DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	 * desiredCapabilities.setCapability("deviceName", "Mi A1");
	 * desiredCapabilities.setCapability("udid", "33c041340704");
	 * desiredCapabilities.setCapability("platformName", "Android");
	 * desiredCapabilities.setCapability("platformVersion", "9");
	 * desiredCapabilities.setCapability("automationName", "UiAutomator1");
	 * desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
	 * desiredCapabilities.setCapability("appActivity",
	 * "org.wordpress.android.ui.posts.PostsActivity");
	 * 
	 * URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	 * System.out.println("wordpress Mergedcode Launched successfully"); driver =
	 * new AndroidDriver(remoteUrl, desiredCapabilities);
	 */  
	  DesiredCapabilities dc = new DesiredCapabilities();
      dc.setCapability("testName", "Maheswari");
      String accessKey= "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
		dc.setCapability("accessKey", accessKey);
      dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
     // dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.wordpress.android");
      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".PostsActivity");
      driver = new AndroidDriver<>(new URL("https://demo.experitest.com/wd/hub"), dc);
   
  }

  @Test
  public void Mergeteamcode() throws Exception {
    MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/create_site_button");
    el1.click();
    Thread.sleep(4000);
    MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/signup_email");
    el2.click();
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
    MobileElement el11 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
    el11.click();
    Thread.sleep(4000);
    MobileElement el12 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
    el12.click();
    Thread.sleep(4000);
    MobileElement el13 = (MobileElement) driver.findElementById("org.wordpress.android:id/filter_list_button");
    el13.click();
    MobileElement el14 = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"Select a Tag or Site, Pop Up Window\"]/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
    el14.click();
    Thread.sleep(4000);
    MobileElement el15 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[3]");
    el15.click();
    Thread.sleep(4000);
    MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("Notification Settings");
    el16.click();
    Thread.sleep(4000);
    MobileElement el17 = (MobileElement) driver.findElementById("android:id/switch_widget");
    el17.click();
    Thread.sleep(4000);
    MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
    el18.click();
    Thread.sleep(4000);
    MobileElement el19 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
    el19.click();
    MobileElement el20 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_site_current_plan_text_view");
    el20.click();
    Thread.sleep(4000);
    MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]");
    el21.click();
    Thread.sleep(4000);
    MobileElement el22 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
    el22.click();
    Thread.sleep(4000);
    MobileElement el23 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
    el23.click();
    Thread.sleep(4000);
    MobileElement el24 = (MobileElement) driver.findElementById("org.wordpress.android:id/row_stats");
    el24.click();
    Thread.sleep(4000);
    MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
    el25.click();
    Thread.sleep(4000);
    MobileElement el26 = (MobileElement) driver.findElementByAccessibilityId("Reader. Follow content from other sites.");
    el26.click();
    Thread.sleep(4000);
    MobileElement el27 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
    el27.click();
    Thread.sleep(4000);
    MobileElement el28 = (MobileElement) driver.findElementByAccessibilityId("Me");
    el28.click();
    Thread.sleep(4000);
    MobileElement el29 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_my_profile_text_view");
    el29.click();
    MobileElement el30 = (MobileElement) driver.findElementById("org.wordpress.android:id/display_name");
    el30.click();
    MobileElement el31 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
    el31.click();
    el31.sendKeys("Digital training");
    MobileElement el32 = (MobileElement) driver.findElementById("android:id/button1");
    el32.click();
    MobileElement el33 = (MobileElement) driver.findElementById("org.wordpress.android:id/about_me");
    el33.click();
    MobileElement el34 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
    el34.click();
    el34.sendKeys("Alwayz");
    MobileElement el35 = (MobileElement) driver.findElementById("android:id/button1");
    el35.click();
    MobileElement el36 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
    el36.click();
    MobileElement el37 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
    el37.click();
    MobileElement el38 = (MobileElement) driver.findElementById("android:id/button1");
    el38.click();
    
       
  }

  @AfterMethod
public void tearDown() {
	  System.out.println("wordpress Mergedcode Executed successfully");
    driver.quit();
  }
}
