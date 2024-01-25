package com.testScripts;

import org.testng.annotations.Test;

import com.generic_Library.BaseTest_2;
import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;
import com.object_Repository.Add_To_Cart;
import com.object_Repository.Welcome_Page;

public class TC002_AddToCart_Test  extends BaseTest_2{

	
	
	@Test (groups="smokeTesting")
	public void addToCart() throws InterruptedException {
		
		Add_To_Cart ac= new Add_To_Cart(driver);			
		ac.getApparelAndShoesLink().click();
		ac.getAddBlueJeans().click();		
		Welcome_Page wp= new Welcome_Page(driver);		
		wp.getShoppingCartLink().click();
		WebDriver_Utility.scrollToWebElement(driver, ac.getShoppingCartTitle());
		Thread.sleep(2000);
		WebDriver_Utility.takeScreenshotOfWebPage(driver, "shoppingCartScreenshot");
		
	}
}
