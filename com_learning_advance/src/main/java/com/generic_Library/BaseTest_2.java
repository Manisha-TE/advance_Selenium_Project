package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.object_Repository.Home_Page;
import com.object_Repository.Login_Page;
import com.object_Repository.Welcome_Page;

public class BaseTest_2 {
	
	public static WebDriver sDriver;
	public WebDriver driver;
	
	
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws Throwable, InterruptedException {
		String URL= File_Utility.getPropertyValue("url");		
		driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		Reporter.log("Application Lauched Successfully......");	
		sDriver=driver;
		
	}
	@BeforeMethod (alwaysRun = true)
	public void loginToDWS() throws Throwable, InterruptedException {
		
		String USERNAME=File_Utility.getPropertyValue("username");
		String PASSWORD=File_Utility.getPropertyValue("password");
		
		Welcome_Page wp= new Welcome_Page(driver);		
		wp.getLoginLink().click();
		Login_Page lp= new Login_Page(driver);
		lp.getEmailTextFild().sendKeys(USERNAME);
		lp.getPasswordTextField().sendKeys(PASSWORD);
		lp.getLoginButton().click();
		Reporter.log("Logged in Successfully to Demo Web Shop...");
		
	}
	@AfterMethod (alwaysRun = true)
	public void logoutFromDWS() {
		Home_Page hp= new Home_Page(driver);
		
		hp.getLogOutButton().click();
		Reporter.log("Logged out Successfully to Demo Web Shop...");
	}
	@AfterClass (alwaysRun = true)
	public void closeBrowser() {
		
		driver.quit();
		Reporter.log("Browser closed Successfully.....");
	}


}
