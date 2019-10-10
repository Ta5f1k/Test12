package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shared.Shared;

public class MenPage {
WebDriver dr;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement watchOption;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[8]/div/div/div/div[1]/div/div[1]/div/a") WebElement cloneOption;
	public MenPage(WebDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
			
	}
	
	
	public WatchPage clickOnWatchOption()
	{
		dr.findElement(By.id("")).click();
		Shared.click(watchOption);
		return new WatchPage(dr);
	}
	public ClonePage clickOncloneOption()
	{
		Shared.click(cloneOption);
		return new ClonePage(dr);
	}
	

}
