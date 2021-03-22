package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.AmazonAuthorPage;
import pom.AmazonBooksPage;
import pom.AmazonCreateAccount;
import pom.AmazonHomePage;

public class TESTAmazonHomePage 
{
	public WebDriver driver;

  @Test
  
   public void Testcase1()
{
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk");
}
  @Test
  public void Testcase2() throws InterruptedException
  {
		AmazonHomePage clickbutton= new AmazonHomePage(driver);
		clickbutton.clickacceptcookiesMethod();
		clickbutton.clickhamburgermenuMethod();
		clickbutton.clickbooksMethod();
		
		AmazonBooksPage clickbooks=new AmazonBooksPage(driver);
		clickbooks.clickbookspageMethod();
		clickbooks.entertextMethod();
		clickbooks.clicksearchMethod();
		clickbooks.clickbestsellerMethod();
}
  
  @Test
  public void Testcase3()
  {
	  
	  AmazonAuthorPage author=new AmazonAuthorPage(driver);
	  author.authorstephenMethod();
	  author.authorbrowneMethod();
	  author.authorjackthorneMethod();
	  author.authorjohnMethod();
  }
  
  
  @Test
   public void Testcase4() throws InterruptedException
   {
		AmazonHomePage clickbutton= new AmazonHomePage(driver);
		clickbutton.clickhamburgermenuMethod();
		clickbutton.clickbooksMethod();
		
		AmazonBooksPage clickbooks=new AmazonBooksPage(driver);
		clickbooks.clickkindlebooksMethod();
		clickbooks.entertextMethod();
		clickbooks.clicksearchMethod();
		clickbooks.clickontextMethod();
		clickbooks.clickbuyMethod();
   }
  @Test
  public void Testcase5()
  {
	  AmazonCreateAccount createaccount= new AmazonCreateAccount(driver);
	  createaccount.clickcreateaccountMethod();
	  createaccount.entercustomernameMethod();
	  createaccount.enteremailaddressMethod();
	  createaccount.enterpasswordMethod();
	  createaccount.reenterpasswordMethod();
  }
}
  
 