package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_09_GmailAccountVerify_Page extends TestBase {
	public Google_09_GmailAccountVerify_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =XPath.gmailcompose)
	public WebElement gmailcompose;

	public boolean verifygmailgmailcompose() {
		return gmailcompose.isDisplayed();
	}
	@FindBy(xpath =XPath.gmailinbox)
	public WebElement gmailinbox;

	public boolean verifygmailgmailinbox() {
		return gmailinbox.isDisplayed();
	}
	@FindBy(xpath =XPath.gmailstarred)
	public WebElement gmailstarred;

	public boolean verifygmailgmailstarred() {
		return gmailstarred.isDisplayed();
	}
	@FindBy(xpath =XPath.gmailsent)
	public WebElement gmailsent;

	public boolean verifygmailgmailsent() {
		return gmailsent.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
