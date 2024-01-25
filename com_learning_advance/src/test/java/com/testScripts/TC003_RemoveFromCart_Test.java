package com.testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC003_RemoveFromCart_Test extends Base_Test {
	
	
	@Test (groups="smokeTesting")
	
	public void removeCart() throws InterruptedException {
		
		driver.findElement(By.linkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::div[@class='item-box']/descendant::input")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/ancestor::tr/descendant::input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		Thread.sleep(2000);
		WebDriver_Utility.takeScreenshotOfWebPage(driver, "shoppingCartRemoveScreenshot");

		
		
		
	}

}
