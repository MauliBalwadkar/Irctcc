package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPopup {
	
	@FindBy (xpath="//span[text()='Yes']")
	private WebElement yesButton;
	
	//Constructor
	public ConfirmationPopup(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Methods
	public void clickOnCunfirmationYesButton()
	{
		yesButton.click();
	}

}
