package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shared.Shared;

public class HomePage {

	WebDriver dr;
	
	@FindBy(xpath="xpath value log") WebElement homePageLogo;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div/nav/ul/li[1]/a") WebElement menMenuBar;
	public HomePage(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
	}
	public boolean verifyLog() {
		return homePageLogo.isDisplayed();
		
	}
	public MenPage clickOnMemMenu() {
		Shared.click(menMenuBar);
		return new MenPage(dr);
	}
}
