package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCreateAccount {
	
	public WebDriver driver;
	
	@FindBy (id="createAccountSubmit")
	private WebElement ClickCreateAccount;
	
	@FindBy (id="ap_customer_name")
	private WebElement EnterCustomerName;
	
	@FindBy (id="ap_email")
	private WebElement EnterEmailAddress;
	
	@FindBy (id="ap_password")
	private WebElement EnterPassword;
	
	@FindBy (id="ap_password_check")
	private WebElement ReEnterPassword;
	
	@FindBy (xpath="//span[@class='a-button a-button-normal a-button-span12 a-button-primary']")
	private WebElement AccountCreated;
	
	 public AmazonCreateAccount(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	 public void clickcreateaccountMethod()
	 {
		 ClickCreateAccount.click();
	 }
	 public void entercustomernameMethod()
	 {
		 EnterCustomerName.sendKeys("Meghla");
	 }
	 public void enteremailaddressMethod()
	 {
		 EnterEmailAddress.sendKeys("meghlamadan@gmail.com");
	 }
	 public void enterpasswordMethod()
	 {
		 EnterPassword.sendKeys("abc123456");
	 }
	 public void reenterpasswordMethod()
	 {
		 ReEnterPassword.sendKeys("abc123456");
	 }
	 public void accountcreatedMethod()
	 {
		 AccountCreated.click();
	 }

}
