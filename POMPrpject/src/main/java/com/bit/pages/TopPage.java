package com.bit.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shared.Shared;

public class TopPage {
	
	WebDriver dr;
	public TopPage(WebDriver d)
	{
		dr=d;
		PageFactory.initElements(dr, this);
	}
	@FindBy(xpath="") List<WebElement> allTopsProduct;
	
	public TopsProductDetailsPage clickOnTopsProduct() {
		Shared.clickFromlist(allTopsProduct, "WhateverName");
		return new TopsProductDetailsPage(dr);
	}

}
