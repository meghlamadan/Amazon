package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	
	public WebDriver driver;
	
	@FindBy (id="sp-cc-accept")
	private WebElement ClickAcceptCookies;
	
	 @FindBy (xpath="//i[@class='hm-icon nav-sprite']")
	 private WebElement ClickHamBurger;
	 
	 @FindBy (xpath="//div[.='Books']")
	 private WebElement ClickBooks;
	 
	 public AmazonHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 public void clickacceptcookiesMethod()
	 {
		 ClickAcceptCookies.click();
	 }
	 public void clickhamburgermenuMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
	 ClickHamBurger.click();
	 }
	 public void clickbooksMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 ClickBooks.click();
		 
	 }
	
	
	
	

}
