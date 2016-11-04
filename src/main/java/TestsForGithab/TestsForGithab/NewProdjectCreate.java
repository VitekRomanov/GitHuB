package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProdjectCreate {
	
	WebDriver driver;
	
	@FindBy (linkText ="Start a project")
	protected WebElement startproj;                
	  
	//page 2
	
	@FindBy (id ="repository_name")
	protected WebElement repositoryName;
	
	@FindBy (id ="repository_auto_init")
	protected WebElement autoInit;
	
	@FindBy (xpath ="(//button[@type='submit'])[2]")
	protected WebElement createrep;
	
	NewProdjectCreate(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	
	public void repositoriCreate(){
		startproj.click();
		repositoryName.clear();
		repositoryName.sendKeys("SomeName");
		autoInit.click();
		createrep.click();
	}

}
