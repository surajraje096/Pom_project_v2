package Testcases;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Google_01_Page;
import pages.Google_02_Page;
import pages.Google_04_GmailVerifyPage;
import util.ExcelReader;
import pages.Google_03_GmailPage;


public class Google_04_GmailVerifyTest extends TestBase{
	
	ExcelReader excelreader;
	String sheetname = "EmailId&Pass";
	public SoftAssert softassert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage Google_03_GmailPage;
	Google_04_GmailVerifyPage g4;

	String sheetName = "LOGIN";
	
	@BeforeMethod
	public void setBrowser() throws IOException {
		inti();
		softassert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		Google_03_GmailPage = google_02_Page.clickGmail();
		g4 = Google_03_GmailPage.clickonSigninButton();
		g4 = new Google_04_GmailVerifyPage();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		
		String first = i.next();
		String second = i.next();
		
		driver.switchTo().window(second);
		
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_04_GmailVerifyTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test(dataProvider = "getValue")
	public void checkGmailisValidorNot(Hashtable<String, String> table) throws InterruptedException {

		g4.enterId(table.get("Id"));
		Thread.sleep(5000);
		g4.enterPassword(table.get("Password"));
		Thread.sleep(5000);
			
	}

	@DataProvider
	public Object[][] getValue() throws EncryptedDocumentException, IOException {
		excelreader = new ExcelReader();
		return excelreader.getData("EmailId&Pass");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}

	

	


