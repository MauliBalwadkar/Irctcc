package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainListPage {
	
	@FindBy (xpath="//table[@class='ng-tns-c81-60']//td[9]")
	private WebElement sleeperCheckBox ;
	
	@FindBy (xpath="(//strong[text()='Sleeper (SL)'])[1]")
	private WebElement sleeperClass;
	
	@FindBy (xpath="(//div[contains(@class,'AVAILABLE col-xs-12')])[1]")
	private WebElement availableTrains;
	
	@FindBy (xpath="(//button[text()=' Book Now '])[1]")
	private WebElement bookNowButton;
	
	
	
	//constructor
	public TrainListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Medhods
	public void selectSleeperCheckBox()
	{
		if(sleeperCheckBox.isSelected())
		{
			System.out.println("nivant");
		}
		else
		{
			sleeperCheckBox.click();
			
		}
	}
	
	public void clickOnSleeperClass()
	{
		sleeperClass.click();
	}
	
	public void clickOnAvailableTrains()
	{
		availableTrains.click();
	}
	
	public void clickkOnBookNowButton()
	{
		bookNowButton.click();
	}

}
