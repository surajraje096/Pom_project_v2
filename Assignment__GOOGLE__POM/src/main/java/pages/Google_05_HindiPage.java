package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_05_HindiPage extends TestBase {
	public Google_05_HindiPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = XPath.hindi)
	public WebElement hindi;
	
	
	@FindBy(xpath="//div[@id='gws-output-pages-elements-homepage_additional_languages__als']//a[1]")
	WebElement hi;

	public void getActualhindigooglesearchText() {
		List<WebElement> list =driver.findElements(By.xpath("//*[@id=\"SIvCob\"]"));
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			/*if(s1==list.get(i).getText())
			{
				System.out.println("Language is not changed ");
			}else {
				 b=true;
			}*/
				
				System.out.println(list.get(i).getText());
				System.out.println();
			
		}
	String s1=	driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).getText();
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();

		System.out.println(s1);	
		
		
		//boolean b=false;

		
		/*if(b==true) {
		System.out.println("Language is changed");
		}*/
		
		
		
		
/*		hi.click();
		driver.navigate().refresh();
*/
	}

	/*
	 * @FindBy(xpath=XPath.hindi) public WebElement hindi;
	 * 
	 * public boolean hindiText(){ hindi.click(); return hindi.isDisplayed(); }
	 */
}