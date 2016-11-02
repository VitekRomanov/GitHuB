package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToSite {
	
	WebDriver driver;
	
	@FindBy (linkText ="Sign in")
	private WebElement sign_in;
	
	@FindBy (id ="login_field")
	private WebElement user_login;
	
	@FindBy (id ="password")
	private WebElement password;
	
	@FindBy (name="commit")
	private WebElement commit;
	
	LoginToSite(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void loginAs(String usserlog, String userpass){
		
		sign_in.click();
		user_login.sendKeys(usserlog);
		password.sendKeys(userpass);
		commit.click();
	}
	
	
	

}
