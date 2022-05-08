package stepDefinition;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.When;
import pageObject.LoginPage;

public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	public String url="http://www.primevideo.com";
	public String email="dagurkapil5692@gmail.com";
	public String pass="Kapil@123";

	@Given("User Launch Chrome browser")
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Cucumber_Framework\\Drivers\\chromedriver.exe");
         driver=new ChromeDriver();
         lp=new LoginPage(driver);
	}
	@When("User opens URL")
	public void getURL()
	{
		driver.get(url);
	}
	@Then("click on Tryitfree button")
	public void clickOnTry()
	{
		lp.clickOn();
	}
	@Then("User enters Email and Password")
	public void set_email_pass(String email, String pass )
	{
		lp.setEmail(email);
		lp.setPass(pass);
		
	}
	@And ("click on Signin")
	public void clickOnSignIn()
	{
		lp.clickOn();
	}
	@And ("close browser")
	public void close_browser()
	{
		driver.quit();
	}

}
