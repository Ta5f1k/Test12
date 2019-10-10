package com.bit.test;

import org.junit.Test;

import com.bit.pages.CartPage;
import com.bit.pages.CheckoutPage;
import com.bit.pages.LandingPage;
import com.bit.pages.TopPage;
import com.bit.pages.TopsProductDetailsPage;

public class RegressionTest extends BaseTest{
	
	LandingPage landingPage;
	TopPage topPage;
	TopsProductDetailsPage topsProductDetailsPage;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	@Test
	public void buyTShirt()
	{
		landingPage=new LandingPage(driver);
		landingPage.hoverOverOnMenMenu();
		topPage=landingPage.clickOnTopsSubMenu();
		topsProductDetailsPage=topPage.clickOnTopsProduct();
		topsProductDetailsPage.selectColor();
		topsProductDetailsPage.selectSize();
		topsProductDetailsPage.clickAddToCart();
		cartPage=topsProductDetailsPage.clickViewBag();
		checkoutPage=cartPage.clickOnCheckOut();
		
	}

}
