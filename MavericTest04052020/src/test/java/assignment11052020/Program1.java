package assignment11052020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://elastic.rapidtestpro.com:8086/index");
				driver.findElement(By.id("username")).sendKeys("labuser");
				driver.findElement(By.id("password")).sendKeys("labuser@01");
				driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
				Thread.sleep(5000);
				//driver.close();
			    //Select option = new Select(driver.findElement(By.name("Transfer")));
			    //option.deselectByValue(");
			    //driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul[1]/li[3]/ul/li[1]")).click();
				
				//Select option = new Select(driver.findElement(By.name("country")));
				//country.selectByValue("AUSTRALIA");
			    //driver.findElement(By.linkText("Transfer")).click();
				//driver.findElement(By.linkText("Between Accounts")).click();
			    driver.findElement(By.xpath("//a[@role='button'][text()='Transfer ']")).click();
			    Thread.sleep(4000);
				driver.findElement(By.xpath("//a[text()='Between Accounts']")).click();
				Thread.sleep(2000);
				Select from = new Select(driver.findElement(By.id("transferFrom")));
				Thread.sleep(2000);
				from.selectByValue("Primary");
				driver.findElement(By.id("amount")).sendKeys("1");
				Thread.sleep(2000);

	}

}
