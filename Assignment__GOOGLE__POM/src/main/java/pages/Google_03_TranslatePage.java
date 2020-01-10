package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_TranslatePage extends TestBase{

	public Google_03_TranslatePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = XPath.Translatefun)
	public WebElement Translatefun;

	public boolean verifyTranslatefun() {
		return Translatefun.isDisplayed();
	}
	@FindBy(xpath=XPath.Translatesingbtn)
	public WebElement Translatesingbtn;
	
	public Google_04_TranslateVerifyPage clickonSigninButton(){
		Translatesingbtn.click();
		return new Google_04_TranslateVerifyPage();
	}

}
