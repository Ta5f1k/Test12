package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver dr;
	public CartPage(WebDriver d)
	{
		dr=d;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="") WebElement allTopsProduct;
	
	public CheckoutPage clickOnCheckOut() {
		return new CheckoutPage();
	}
}
