package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_playPage extends TestBase{

	public Google_03_playPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =XPath.TitalPlay)
	public WebElement TitalPlay;

	public boolean verifyTitalPlay() {
		return TitalPlay.isDisplayed();
	}
	@FindBy(xpath =XPath.Playsearch)
	public WebElement Playsearch;

	public boolean verifyPlaysearch() {
		return Playsearch.isDisplayed();
	}
	@FindBy(xpath=XPath.Playsingbtn)
	public WebElement Playsingbtn;
	
	public Google_04_PlaystoreVerifyPage clickonSigninButton(){
		Playsingbtn.click();
		return new Google_04_PlaystoreVerifyPage();
	}
}
