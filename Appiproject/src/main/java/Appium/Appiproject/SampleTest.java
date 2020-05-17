package Appium.Appiproject;

	
	import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import java.net.MalformedURLException;
	import java.net.URL;
	import org.openqa.selenium.remote.DesiredCapabilities;

	public class SampleTest {

	  private AndroidDriver driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		/*
		 * desiredCapabilities.setCapability("deviceName", "Mi A1");
		 * desiredCapabilities.setCapability("udid", "33c041340704");
		 * desiredCapabilities.setCapability("platformName", "Android");
		 * desiredCapabilities.setCapability("platformVersion", "9");
		 * desiredCapabilities.setCapability("automationName", "UiAutomator1");
		 * desiredCapabilities.setCapability("appPackage", "com.experitest.ExperiBank");
		 * desiredCapabilities.setCapability("appActivity",
		 * "com.experitest.ExperiBank.LoginActivity");
		 * 
		 * URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		 * 
		 * driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		 */
	    DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("testName", "Maheswari");
        String accessKey= "eyJ4cC51Ijo0NTU2OTksInhwLnAiOjQ1NTY4OSwieHAubSI6Ik1UVTRPVE0yT0RFNU1EVTFOQSIsImFsZyI6IkhTMjU2In0.eyJleHAiOjE5MDQ3MjgxOTEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.12UHA51l_lyYn3qF65unNXg4oVcfUEIFgYZepzMQQAM";
		dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
       // dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        driver = new AndroidDriver<>(new URL("https://demo.experitest.com/wd/hub"), dc);
   
	    }

	  @Test
	  public void sampleTest() throws Exception {
			/*
			 * MobileElement el1 = (MobileElement)
			 * driver.findElementById("android:id/button1"); el1.click();
			 */   Thread.sleep(4000);
	    MobileElement el2 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
	    el2.sendKeys("company");
	    MobileElement el3 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
	    el3.sendKeys("company");
	    MobileElement el4 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/makePaymentButton");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/phoneTextField");
	    el6.sendKeys("98765445678");
	    MobileElement el7 = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/nameTextField");
	    el7.sendKeys("Mahes");
	    (new TouchAction(driver))
	      .press(PointOption.point(479, 781))
	      .moveTo(PointOption.point(479, 781))
	      .release()
	    .perform();
	      
	   //x= 479 , y= 781 
	  }
	  @After
	  public void tearDown() {
		  System.out.println("EriBank Application invoked successfully");
	    driver.quit();
	  }
	}

