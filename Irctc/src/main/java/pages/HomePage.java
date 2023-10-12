package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//variable declare
	@FindBy (xpath="//img[@id='disha-banner-close']")
	private WebElement askDishaCrossButton;
	
	@FindBy (xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement fromTextBox;
	
	@FindBy(xpath="//ul[@role='listbox']//li//span[@class='ng-star-inserted']")
	private List<WebElement> fromTextBoxList;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")
	private WebElement toTextBox;
	
	@FindBy (xpath="//ul[@id='pr_id_2_list']//li//span[@class='ng-star-inserted']")
	private List<WebElement> listOfToTextBox;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement dateButton;
	
	@FindBy(xpath="//a[text()='22']")
	private WebElement dateFromDropDown;
	
	@FindBy(xpath="(//div[@role='button'])[1]")
	private WebElement classesButton;
	
	@FindBy(xpath="//ul[@role='listbox']//li//span[text()='AC First Class (1A) ']")
	private WebElement dropDownOfClassesButton;
	
	@FindBy(xpath="(//div[@role='button'])[2]")
	private WebElement generalButton;
	
	@FindBy(xpath="//span[text()='LOWER BERTH/SR.CITIZEN']")
	private WebElement listOfGeneralButton;
	
	@FindBy(xpath="//span[@class='ui-button-text ui-clickable']")
	private WebElement okButtonOfConfirmationPopUp;
	
	@FindBy(xpath="//label[text()='Railway Pass Concession']")
	private WebElement railwayPassConsessionCheckBox;
	
	@FindBy(xpath="//span[text()='OK']")
	private WebElement railwayPassConsessionCheckBoxConfirmationPopUp;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	//constructor initialize
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void clickOnAskDishaCrossButton()
	{
		askDishaCrossButton.click();
	}
	
	public void sendValueIntoFromTextBox(String city)
	{
		fromTextBox.sendKeys(city);
	}
	
	public void selectOptionFromTextBoxList()
	{
		for(int i=0 ; i<fromTextBoxList.size() ; i++)
		{
			String result = fromTextBoxList.get(i).getText();
			if(result.contains("PUNE"))
			{
				fromTextBoxList.get(i).click();
				break;
			}
		}
		
	}
	
	public void sendValueIntoToTextBox(String city)
	{
		toTextBox.sendKeys(city);
	}
	
	public void selectListOfToTextBox()
	{
		for(int i=0 ; i<listOfToTextBox.size(); i++)
		{
			String result = listOfToTextBox.get(i).getText();
			if(result.contains("THANE"))
			{
				listOfToTextBox.get(i).click();
				break;
			}
		}
	}
	
	public void clickOnDateButton()
	{
		dateButton.click();
	}
	
	
	public void selectDateFromDateDropDown()
	{
		dateFromDropDown.click();
	}
	
	public void clickOnClassesButton()
	{
		classesButton.click();
	}
	
	public void selectDropDownOfClassesButton()
	{
		dropDownOfClassesButton.click();
	}
	
	public void clickOnGeneralButton()
	{
		generalButton.click();
	}
	
	public void selectListOfGeneralButton()
	{
		generalButton.click();
	}
	
	
	public void clickOnOkButtonOfConfirmationPopUp()
	{
		okButtonOfConfirmationPopUp.click();
	}
	
	public void clickOnRailwayConcessionCheckBox()
	{
		railwayPassConsessionCheckBox.click();
	}
	
	
	public void clickOnRailwayConcessionConfirmationPopUp()
	{
		railwayPassConsessionCheckBoxConfirmationPopUp.click();
	}
	
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	

}
