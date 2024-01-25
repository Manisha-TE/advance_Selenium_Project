package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base_Test {
	
		public WebDriver driver;
		
	@Parameters ("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browser) {
		
		if (browser.equals("chrome")) {
			driver=new ChromeDriver();
			
		}else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}else if (browser.equals("edge")) {
			driver=new EdgeDriver();
			
		}else {		
		driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Application Lauched Successfully......");	
		
	}
	@BeforeMethod (alwaysRun = true)
	public void loginToDWS() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("123Manisha@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Manisha2");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Logged in Successfully to Demo Web Shop...");
		
	}
	@AfterMethod (alwaysRun = true)
	public void logoutFromDWS() {
		
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logged out Successfully to Demo Web Shop...");
	}
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		
		driver.quit();
		Reporter.log("Browser closed Successfully.....");
	}

}
