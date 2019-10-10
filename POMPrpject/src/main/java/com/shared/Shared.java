package com.shared;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Shared {
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void clickFromlist(List<WebElement> elements,String text)
	{
		for(WebElement element:elements)
		{
			if(element.getText().equals(text))
			{
				element.click();
			}
		}
	}

}
