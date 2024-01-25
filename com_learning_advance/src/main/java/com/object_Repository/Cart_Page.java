package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	
	public Cart_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='page-title']")
	private WebElement shoppingCartTitle;
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement removeCartCheckBox;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateShoppingCartButton;

	public WebElement getShoppingCartTitle() {
		return shoppingCartTitle;
	}

	public WebElement getRemoveCartCheckBox() {
		return removeCartCheckBox;
	}

	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}

}
