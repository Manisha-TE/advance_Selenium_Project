package com.learning_TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic_Library.BaseTest_2;
import com.generic_Library.WebDriver_Utility;

@Listeners(com.generic_Library.Listener_Implimentation.class)
public class Learning_ITestlistener extends BaseTest_2{

	
	@Test
	public void addToCart() throws InterruptedException {
		
		
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='item-box']/descendant::input")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Assert.assertEquals(driver.getTitle(), "demo web shop");
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		Thread.sleep(2000);		
		
	}
}
