package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_SearchPage extends TestBase {

	public Google_03_SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =XPath.searchboxsearch)
	public WebElement searchboxsearch;

	public boolean verifysearchboxsearch() {
		return searchboxsearch.isDisplayed();
	}
	@FindBy(xpath =XPath.searchboxsearchbtn)
	public WebElement searchboxsearchbtn;

	public boolean verifysearchboxsearchbtn() {
		return searchboxsearchbtn.isDisplayed();
	}
	@FindBy(xpath =XPath.searchboxsearchlucky)
	public WebElement searchboxsearchlucky;

	public boolean verifysearchboxsearchlucky() {
		return searchboxsearchlucky.isDisplayed();
	}
	@FindBy(xpath=XPath.Searchsingbtn)
	public WebElement Searchsingbtn;
	
	public Google_04_SearchVerifyPage clickonSigninButton(){
		Searchsingbtn.click();
		return new Google_04_SearchVerifyPage();
	}

}
