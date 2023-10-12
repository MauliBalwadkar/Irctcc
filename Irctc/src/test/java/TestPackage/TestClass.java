package TestPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import modules.ConfirmationPopup;
import pages.HomePage;
import pages.TrainListPage;

public class TestClass {

	public static void main(String[] args) throws IOException
	{
		
		WebDriverManager.chromedriver().setup();
		System.out.println("hi");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		HomePage _homePage = new HomePage(driver);
		_homePage.clickOnAskDishaCrossButton();
		_homePage.sendValueIntoFromTextBox("Pune");
		_homePage.selectOptionFromTextBoxList();
		_homePage.sendValueIntoToTextBox("Mumbai");
		_homePage.selectListOfToTextBox();
		_homePage.clickOnDateButton();
		_homePage.selectDateFromDateDropDown();
		_homePage.clickOnClassesButton();
		_homePage.selectDropDownOfClassesButton();
		_homePage.clickOnGeneralButton();
		_homePage.selectListOfGeneralButton();
		//_homePage.clickOnOkButtonOfConfirmationPopUp();
		_homePage.clickOnRailwayConcessionCheckBox();
		_homePage.clickOnRailwayConcessionConfirmationPopUp();
		_homePage.clickOnSearchButton();
		
		TrainListPage _trainListPage = new TrainListPage(driver);
		_trainListPage.selectSleeperCheckBox();
		_trainListPage.clickOnSleeperClass();
		_trainListPage.clickOnAvailableTrains();
		_trainListPage.clickkOnBookNowButton();
		
		ConfirmationPopup _confirmationPopup = new ConfirmationPopup(driver);
		_confirmationPopup.clickOnCunfirmationYesButton();
		
        TakesScreenshot ts =(TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\DELL\\Pictures\\Screenshots\\irctc.jpeg" );
		FileHandler.copy(src, desc);
		
		
	}
	
}
