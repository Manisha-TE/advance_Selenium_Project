package com.testScripts;

import org.testng.annotations.Test;

import com.generic_Library.BaseTest_2;
import com.generic_Library.WebDriver_Utility;
import com.object_Repository.Welcome_Page;

public class TC001_Search_Test extends BaseTest_2 {
	
	
	@Test 
	public void searchTest() throws InterruptedException {
		
		Welcome_Page wp=new Welcome_Page(driver);
		wp.getSearchTextField().sendKeys("Books");
		wp.getSearchButton().click();
		Thread.sleep(2000);
		WebDriver_Utility.scrollToWebElement(driver, wp.getSearchTitleText());
		Thread.sleep(2000);
		WebDriver_Utility.takeScreenshotOfWebPage(driver, "searchScreenshot");
	}

}
