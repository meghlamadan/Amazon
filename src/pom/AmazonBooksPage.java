package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBooksPage {
	
	public WebDriver driver;
	
	@FindBy (xpath="(//a[.='Books'])[3]")
	private WebElement BooksPage;
	
	@FindBy (xpath="(//a[.='Kindle Books'])[4]")
	private WebElement KindleBooks;
	
	@FindBy (id="twotabsearchtextbox")
	private WebElement EnterText;
	
	@FindBy (id="nav-search-submit-button")
	private WebElement ClickSearch;
	
	@FindBy (xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement ClickonText;
	
	@FindBy (id="checkoutButtonId")
	private WebElement ClickBuyButtton;
	
	 public AmazonBooksPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	 public void clickbookspageMethod()
	 {
		 BooksPage.click();
	 }
	 
	 public void clickkindlebooksMethod() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 KindleBooks.click();
	 }
	 public void entertextMethod()
	 {
	 EnterText.sendKeys("Harry Potter and the Philosopher's Stone");
	 }
	 public void clicksearchMethod()
	 {
		 ClickSearch.click();
	 }
	 public void clickbestsellerMethod()
	 {
		 
		 WebElement Bestsellertool=driver.findElement(By.xpath("(//span[.='Best Seller'])[1]"));
		 String Bestsellertext=Bestsellertool.getText();
		 if(Bestsellertext.equalsIgnoreCase("Best Seller"))
		 {
			 System.out.println("The Book is Best Seller");
		 }
		 else
		 {
			 System.out.println("The Book is Not Best Seller");
		 }
		
	 }
	 public void clickontextMethod()
	 {
		 ClickonText.click();
	 }
	 public void clickbuyMethod()
	 {
		 ClickBuyButtton.click();
	 }

}
