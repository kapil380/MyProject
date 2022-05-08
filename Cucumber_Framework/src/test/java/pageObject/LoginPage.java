package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
       
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	@FindBy(xpath="//*[@id=\"pv-nav\"]/div/div/div[3]/a")
	@CacheLookup
	WebElement clickOnTry;
	
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement Email;
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	WebElement Pass;
	
	@FindBy(id="signInSubmit")
	@CacheLookup
	WebElement Submit;
	
	
	public void clickOn()
	{
		clickOnTry.click();
	}
	public void setEmail(String email)
	{
		Email.clear();
		Email.sendKeys(email);
	}
	
	public void setPass(String pwd)
	{
		Pass.clear();
		Pass.sendKeys(pwd);
	}
	
	public void submit()
	{
		Submit.click();
	}
	
			
}
