package com.object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cart {
	
	public Add_To_Cart(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(partialLinkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;
	
	@FindBy(xpath = "//a[text()='Blue Jeans']/ancestor::div[@class='item-box']/descendant::input")
	private WebElement addBlueJeans;
	
	@FindBy (xpath = "//h1[text()='Shopping cart'")
	private WebElement shoppingCartTitle;
	
	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}
	public WebElement getAddBlueJeans() {
		return addBlueJeans;
	}
	public WebElement getShoppingCartTitle() {
		return shoppingCartTitle;
	}
	
	

}
