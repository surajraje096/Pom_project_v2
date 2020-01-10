package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_MapsPage extends TestBase{

	public Google_03_MapsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = XPath.Mapsearchbox)
	public WebElement Mapsearchbox;

	public boolean verifyMapsearchbox() {
		return Mapsearchbox.isDisplayed();
	}
	@FindBy(xpath = XPath.MAptool)
	public WebElement MAptool;

	public boolean verifyMAptool() {
		return MAptool.isDisplayed();
	}
	@FindBy(xpath=XPath.Mapssingbtn)
	public WebElement Mapssingbtn;
	
	public Google_04_MapVerifyPage clickonSigninButton(){
		Mapssingbtn.click();
		return new Google_04_MapVerifyPage();
	}


}
