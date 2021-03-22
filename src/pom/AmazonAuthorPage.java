package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAuthorPage {
	
	public WebDriver driver;
	
	@FindBy (xpath="//span[.='Stephen Fry']")
	private WebElement AuthorStephen;
	
	@FindBy (xpath="//span[.='J A Browne']")
	private WebElement AuthorJABrowne;
	
	@FindBy (xpath="//span[.='Jack Thorne']")
	private WebElement AuthorJackThorne;
	
	@FindBy (xpath="//span[.='John Tiffany']")
	private WebElement AuthorJohnTiffany; 
	
	public AmazonAuthorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void authorstephenMethod()
	{
		WebElement authorname1=driver.findElement(By.xpath("//span[.='Stephen Fry']"));
		System.out.println(authorname1.getText());
		authorname1.click();
		//AuthorStephen.click();
		//AuthorStephen.getText();
		
	}
	public void authorbrowneMethod()
	{
		AuthorJABrowne.click();
	}
	public void authorjackthorneMethod()
	{
		AuthorJackThorne.click();
	}
	public void authorjohnMethod()
	{
		AuthorJohnTiffany.click();
	}

}
