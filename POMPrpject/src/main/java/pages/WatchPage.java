package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shared.Shared;

public class WatchPage {
WebDriver dr;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement firstWatch;
	public WatchPage(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
		
		
		
		
	}
	
	public WatchProductDetailpage clickOnWatch() {
		Shared.click(firstWatch);
		return new WatchProductDetailpage();
	}

}
