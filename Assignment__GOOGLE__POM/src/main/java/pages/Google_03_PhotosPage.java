package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_PhotosPage extends TestBase {

	public Google_03_PhotosPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =XPath.TitalPhotos)
	public WebElement TitalPhotos;

	public boolean verifyTitalPhotos() {
		return TitalPhotos.isDisplayed();
	}
	@FindBy(xpath =XPath.gotoPhotos)
	public WebElement gotoPhotos;

	public boolean verifygotoPhotos() {
		return gotoPhotos.isDisplayed();
	}
	@FindBy(xpath=XPath.Photossingbtn)
	public WebElement Photossingbtn;
	
	public Google_04_PhotosVerifyPage clickonSigninButton(){
		Photossingbtn.click();
		return new Google_04_PhotosVerifyPage();
	}
}
