package TestsForGithab.TestsForGithab;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage {

	private WebDriver driver;	
	private LoginPage login;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	        driver.get("https://github.com");	
	        login.loginAs("testuser27103", "2710user");
	      
	}



	@Test
	public void testLoginAs() {

		assertEquals(driver.findElement(By.name("re")),"button");
	}

}
