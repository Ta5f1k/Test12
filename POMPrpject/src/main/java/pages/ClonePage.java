package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClonePage {
WebDriver dr;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement watchOption;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement cloneOption;
	public ClonePage(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
		
		
		
		
	}

}
