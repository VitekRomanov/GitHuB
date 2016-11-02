package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestRegistration {

WebDriver driver;

    @FindBy(linkText = "Sign up")
    private  WebElement Sign_up;

// step 1	

	@FindBy(id = "user_login")
	private  WebElement user_login;
	
	@FindBy(id = "user_email")
	private  WebElement user_email;
	
	@FindBy(id = "user_password")
	private  WebElement user_password;
	
	@FindBy(id = "signup_button")
	private  WebElement signup_button;

// step 2
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private  WebElement contin;
	
//step 3  Tailor your experience 

			
	@FindBy(id="answers_98_choice_461")
	private WebElement chose1;
	
	@FindBy(id="answers_99_choice_469")
	private WebElement chose2;
	
	@FindBy(id="answers_100_choice_473")
	private WebElement chose3;
	

	@FindBy(name = "commit")
	private WebElement singup;
	
	TestRegistration(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void RegistrAs (String username,String usermail, String userpass ){
		
		Sign_up.click();
		
		user_login.sendKeys(username);
		user_email.sendKeys(usermail);
		user_password.sendKeys(userpass);
		signup_button.click();
		
		contin.click();
		
		chose1.click();
		chose2.click();
		chose3.click();
		singup.click();
	}

	
	
}
