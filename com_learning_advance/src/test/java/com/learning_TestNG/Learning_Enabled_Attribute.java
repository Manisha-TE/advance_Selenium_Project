package com.learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Enabled_Attribute {

	
	@Test(enabled=false)
	public void resisterTest() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Manisha", Keys.TAB,"Sahay", Keys.TAB,"123Manisha@gmail.com", Keys.TAB, "Manisha2", Keys.TAB, "Manisha2", Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
	
		@Test 
		public void loginTest() throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("123Manisha@gmail.com", Keys.TAB, "Manisha2", Keys.ENTER);
			Thread.sleep(2000);
			driver.quit();			
			
		}
			@Test (dependsOnMethods=  "loginTest")
			public void searchTest() {
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://demowebshop.tricentis.com/");
				driver.findElement(By.id("small-searchterms")).sendKeys("Mobile", Keys.ENTER);
				driver.quit();
				
			}
}
