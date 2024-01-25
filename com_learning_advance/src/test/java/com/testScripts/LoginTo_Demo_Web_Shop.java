package com.testScripts;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTo_Demo_Web_Shop {
	
	WebDriver driver;
	
	@Test	
	public void loginDWS() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");		
		if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
			Reporter.log("Welcome page should display", true);
			
		} 
		driver.findElement(By.linkText("Log in")).click();
		if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login")) {
			Reporter.log("Login page should display Successfully", true);
						 
		}
		driver.findElement(By.id("Email")).sendKeys("123Manisha@gmail.com", Keys.TAB, "Manisha2", Keys.ENTER);
		
		if (driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
			Reporter.log("Home Page should display", true);
			
		}
		driver.quit();
		
	}
	

}
