package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_DdrivePage extends TestBase {

	public Google_03_DdrivePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = XPath.TitalDrive)
	public static WebElement drive;

	public boolean verifyGoogledrive() {
		return drive.isDisplayed();
	}

	@FindBy(xpath = XPath.MeetDrive)
	public static WebElement Meetdriver;

	public static boolean verifyGoogleMeetdrive() {
		return Meetdriver.isDisplayed();
	}

	@FindBy(xpath = XPath.usingDrive)
	public static WebElement usingDrive;

	public static boolean verifyGoogleusingDrive() {
		return usingDrive.isDisplayed();
	}

	@FindBy(xpath = XPath.Drivelogo)
	public WebElement Drivelogo;

	public boolean verifyGooglDrivelogo() {
		return Drivelogo.isDisplayed();
	}

	@FindBy(xpath = XPath.gotoDrive)
	public static WebElement gotoDrive;

	public static boolean verifyGooglgotoDrive() {
		return gotoDrive.isDisplayed();
	}
	@FindBy(xpath=XPath.Drivesingbtn)
	public WebElement Drivesingbtn;
	
	public Google_04_DriveVerifyPage clickonSigninButton(){
		Drivesingbtn.click();
		return new Google_04_DriveVerifyPage();
	}

}
