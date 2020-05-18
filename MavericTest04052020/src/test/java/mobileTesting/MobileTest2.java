package mobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest2 {


    protected AndroidDriver<MobileElement> driver = null;
    DesiredCapabilities cap = new DesiredCapabilities();
   
    @Test
    public void setUp() throws MalformedURLException, InterruptedException {
       
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
       
       driver.findElementById("com.experitest.ExperiBank:id/usernameTextField").sendKeys("company");
       driver.findElementById("com.experitest.ExperiBank:id/passwordTextField").sendKeys("company");
       driver.navigate().back();
       driver.findElementById("com.experitest.ExperiBank:id/loginButton").click();
        
        //driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).sendKeys("company");
       	//driver.findElement(By.xpath("//android.widget.EditText[@text='password']")).sendKeys("company");
       	//driver.findElement(By.id("password")).sendKeys("company");
        //driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click();
       	
        //driver.findElement(By.id("password")).sendKeys("company");
        //driver.findElement(By.id("login")).click();
       
        }
}