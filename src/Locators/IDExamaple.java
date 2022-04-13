package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IDExamaple {
	@Test
	public void IdDemo() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\DXC Selenium Automation\\Locators in Selenium 2\\SeleniumBrowserJars\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("rajatraj609@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("rajatraj123");
	}

}
