package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestRegistration {

WebDriver driver;

	
	@FindBy(id = "user_login")
	private  WebElement user_login;
	
	@FindBy(id = "user_email")
	private  WebElement user_email;
	
	@FindBy(id = "user_password")
	private  WebElement user_password;
	
	@FindBy(id = "signup_button")
	private  WebElement signup_button;
	
	TestRegistration(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void RegistrAs (String username,String usermail, String userpass ){
		user_login.sendKeys(username);
		user_email.sendKeys(usermail);
		user_password.sendKeys(userpass);
		signup_button.click();
	}

	
	
}
