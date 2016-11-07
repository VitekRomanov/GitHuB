package TestsForGithab.TestsForGithab;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	
	static WebDriver driver;	
	static NewProdjectCreate project;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); //путь к твоему chromedriver.exe
	    driver = new ChromeDriver();            
        driver.get("https://github.com");
        project = new NewProdjectCreate(driver);
		 //SingletonWebDriwer.getInstance(driver);
        LoginPage login = new LoginPage(driver);
        login.loginAs("testuser2710", "2710user");
        
        System.out.println("Старт");
       
	}
	
	@Before
	public void setUpBefore() throws Exception {		
		driver.get("https://github.com");
		System.out.println("Старт второй");
	}


	@Test
	public void testLoginAs() {		
		 assertTrue("Url is correct",driver.getCurrentUrl().equals("http://github.com"));
	}

	@Test
	public void testNewProdjectCreate() {	
		assertEquals("Somename",project.repositoriCreate());
	}

	
}
