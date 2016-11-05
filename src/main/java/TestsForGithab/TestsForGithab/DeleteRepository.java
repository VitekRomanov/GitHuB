package TestsForGithab.TestsForGithab;

import java.awt.Button;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteRepository {
	
	
	private WebDriver driver;

	@FindBy(linkText="3")
	private WebElement repositoryName;
	
	@FindBy(xpath="//div[@id='js-repo-pjax-container']/div/div[2]/nav/a[5]")
	private WebElement settings;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement deleterepositoru;
	
	@FindBy(name="verify")
	private WebElement verify;
	
	DeleteRepository(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	

	public void repositoryDelete(){
		repositoryName.click();
		settings.click();
		deleterepositoru.click();
		verify.sendKeys("3");
		verify.submit();
			
	}
	

}
