package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public Home_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}
	
	@FindBy(linkText = "Log out")
	private WebElement logOutButton;

	
}
