package com.bit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	@FindBy(xpath="") WebElement menMenu;
	@FindBy(xpath="") WebElement topsSubMenu;
	
	public LandingPage(WebDriver dr)
	{
		driver=dr;
		PageFactory.initElements(dr, this);
	}
	public void hoverOverOnMenMenu() {
		Actions a=new Actions(driver);
		a.moveToElement(menMenu).perform();
	}
	public TopPage clickOnTopsSubMenu() {
		topsSubMenu.click();
		return new TopPage(driver);
	}

}
