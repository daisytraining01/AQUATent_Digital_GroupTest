package Sample.NextGene;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * Unit test for simple App.
 */
public class TestCaseOne_WordPress_Emulator 
{
	
	 private AndroidDriver driver;
	 
	@BeforeTest
	
	 public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("deviceName", "Android SDK build for x86");
	    desiredCapabilities.setCapability("udid", "emulator-5554");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "10");
	    desiredCapabilities.setCapability("automationName", "UiAutomator1");
	    desiredCapabilities.setCapability("appPackage", "org.wordpress.android");
	    desiredCapabilities.setCapability("appActivity", "org.wordpress.android.ui.WPLaunchActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	  }
	
	//Priyadharshini
	@Test(priority=1)
	public void sampleTestNgWordPressSignUpTest() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/create_site_button");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("org.wordpress.android:id/signup_email");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gms:id/cancel");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
	    el5.sendKeys("susilamaheswari@gmail.com");
	    MobileElement el6 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el6.click();
	    Thread.sleep(5000);
	    MobileElement el7 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_enter_password");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
        el8.click();
        Thread.sleep(5000);
        MobileElement el9 = (MobileElement) driver.findElementById("org.wordpress.android:id/input");
        el9.sendKeys("Monika10#");
        Thread.sleep(5000);
        MobileElement el10 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
        el10.click();
        Thread.sleep(5000);
        MobileElement el11 = (MobileElement) driver.findElementById("org.wordpress.android:id/dismiss_button");
        el11.click();
        
        MobileElement el15 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
        el15.click();
        Thread.sleep(5000);
        MobileElement el61 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_item");
        el61.click();
        MobileElement el62 = (MobileElement) driver.findElementById("org.wordpress.android:id/row_my_profile");
        el62.click();
        MobileElement el63 = (MobileElement) driver.findElementById("org.wordpress.android:id/first_name_row");
        el63.click();
        MobileElement el64 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el64.clear();
        MobileElement el65 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el65.sendKeys("Maheswari");
        MobileElement el66 = (MobileElement) driver.findElementById("android:id/button1");
        el66.click();
        MobileElement el67 = (MobileElement) driver.findElementById("org.wordpress.android:id/last_name_row");
        el67.click();
        MobileElement el68 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el68.clear();
        MobileElement el69 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el69.sendKeys("Susila");
        MobileElement el160 = (MobileElement) driver.findElementById("android:id/button1");
        el160.click();
        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el19.clear();
        MobileElement el110 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el110.sendKeys("Aqua Tent");
        MobileElement el111 = (MobileElement) driver.findElementById("android:id/button1");
        el111.click();
        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.TextView");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el13.clear();
        MobileElement el131 = (MobileElement) driver.findElementById("org.wordpress.android:id/my_profile_dialog_input");
        el131.sendKeys("Together everyone achieves more");
        MobileElement el14 = (MobileElement) driver.findElementById("android:id/button1");
        el14.click();
        MobileElement el115 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
        el115.click();
        
        MobileElement el126 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
	    el126.click();
	    MobileElement el127 = (MobileElement) driver.findElementById("android:id/button1");
	    el127.click();
	    
	    System.out.println("Execution Completed Successfully");
  
	  }
	
	//Priyadharshini
	@Test(priority=2)
	public void sampleWordPressLoginTest() throws Exception {
		MobileElement el1 = (MobileElement) driver.findElementById("org.wordpress.android:id/login_button");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gms:id/credential_primary_label");
	    el2.click();
	    Thread.sleep(3000);
	    MobileElement el3 = (MobileElement) driver.findElementById("org.wordpress.android:id/primary_button");
	    el3.click();
	    Thread.sleep(3000);
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Notifications. Manage your notifications.");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[2]");
	    el7.click();
	    Thread.sleep(3000);
	    MobileElement el8 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"following\"]/android.widget.TextView");
	    el8.click();
	    MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Edit tags and sites");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Followed sites\"]/android.widget.TextView");
	    el10.click();
	    MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.widget.TextView[1]");
	    el11.click();
	    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	    el12.click();
	    MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	    el13.click();
	    Thread.sleep(2000);
	    MobileElement el14 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageView[@content-desc=\"My Site. View your site and manage it, including stats.\"])[1]");
	    el14.click();
	    MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Me");
	    el15.click();
	    MobileElement el16 = (MobileElement) driver.findElementById("org.wordpress.android:id/me_login_logout_text_view");
	    el16.click();
	    MobileElement el17 = (MobileElement) driver.findElementById("android:id/button1");
	    el17.click();
	    Thread.sleep(3000);
	    System.out.println("Execution Completed Successfully");
       }

	@AfterTest
	public void tearDown() {
	    driver.quit();
	  }
}
