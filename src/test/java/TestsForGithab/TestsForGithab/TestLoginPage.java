package TestsForGithab.TestsForGithab;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {
	public WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); //путь к твоему chromedriver.exe
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://github.com");
        
        LoginPage login = new LoginPage(driver);
        login.loginAs("testuser2710", "2710user");
        
        System.out.println("Старт");
	}
	
	@Before
	
	public  void setUpBefore() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com");
		System.out.println("Старт второй");
	}


	@Test
	public void testLoginAs() {

		assertNotNull(driver.findElement(By.name("re")));
	}

	@Test
	public void testNewProdjectCreate() {
		NewProdjectCreate project = new NewProdjectCreate(driver);
		project.repositoriCreate();
		assertNotNull(driver.findElement(By.name("re")));
	}

	
}
