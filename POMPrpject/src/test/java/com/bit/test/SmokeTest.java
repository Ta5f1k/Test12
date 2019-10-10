package com.bit.test;

import org.junit.Test;

import pages.ClonePage;
import pages.HomePage;
import pages.MenPage;
import pages.WatchPage;
import pages.WatchProductDetailpage;

public class SmokeTest extends BaseTest{
	HomePage h;
	MenPage m;
	WatchPage w;
	WatchProductDetailpage wp;
	 ClonePage cp;
	@Test
	public void test1() {
		h=new HomePage(driver);
		h.verifyLog();
		m=h.clickOnMemMenu();
		w=m.clickOnWatchOption();
		wp=w.clickOnWatch();
	}

	@Test
	public void test2() {
		h=new HomePage(driver);
		h.verifyLog();
		m=h.clickOnMemMenu();
		cp=m.clickOncloneOption();
		
	}

}
