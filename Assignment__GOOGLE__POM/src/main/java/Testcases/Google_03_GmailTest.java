package Testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Google_01_Page;
import pages.Google_02_Page;
import pages.Google_03_GmailPage;


public class Google_03_GmailTest extends TestBase {

	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage Google_03_GmailPage;
	SoftAssert softAssert;
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_03_GmailTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		inti();
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		Google_03_GmailPage = google_02_Page.clickGmail();
	}
	
	@Test
	public void verifygmailCreatGmail()
	{
		boolean flag = Google_03_GmailPage.verifygmailCreatGmail();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	@Test
	public void verifyGmailGmaillogo()
	{
		boolean flag = Google_03_GmailPage.verifyGmailGmaillogo();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
