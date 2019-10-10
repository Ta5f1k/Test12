package com.bit.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopsProductDetailsPage {

	WebDriver dr;
	public TopsProductDetailsPage(WebDriver d)
	{
		dr=d;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="") WebElement allTopsProduct;
	public void selectColor() {
		
	}
public void selectSize() {
		
	}
public void clickAddToCart() {
	
}

  public CartPage clickViewBag() {
	return new CartPage(dr);
}
	
}
