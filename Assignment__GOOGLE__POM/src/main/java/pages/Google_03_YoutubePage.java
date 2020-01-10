package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_03_YoutubePage extends TestBase {

	public Google_03_YoutubePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =XPath.TitalYouTube)
	public WebElement TitalYouTube;

	public boolean verifyTitalYouTube() {
		return TitalYouTube.isDisplayed();
	}

	@FindBy(xpath = XPath.YouTubesearchbox)
	public WebElement YouTubesearchbox;

	public boolean verifyYouTubesearchbox() {
		return YouTubesearchbox.isDisplayed();
	}
	@FindBy(xpath=XPath.YouTubesingbtn)
	public WebElement YouTubesingbtn;
	
	public Google_04_YoutubeVerifyPage clickonSigninButton(){
		YouTubesingbtn.click();
		return new Google_04_YoutubeVerifyPage();
	}


}
