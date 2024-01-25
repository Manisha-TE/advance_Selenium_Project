package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Soft_Assert {
	
	@Test
	public void loginDWS() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ast= new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Demo Web Sho", "Validating Welcome page");
		driver.findElement(By.linkText("Log in")).click();
		ast.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/", "Validating login page");
		driver.findElement(By.id("Email")).sendKeys("123Manisha@gmail.com", Keys.TAB, "Manisha2", Keys.ENTER);
		ast.assertEquals(driver.getTitle(), "Demo Web Sho");
		Thread.sleep(2000);
		driver.quit();
		ast.assertAll();
}
}
