package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); //путь к твоему chromedriver.exe
       WebDriver driver = new FirefoxDriver();

        driver.get("https://github.com");
//        
////        TestRegistration registr = new TestRegistration(driver);
////        registr.RegistrAs("testuser27103", "jbhuuhardodb@dropmail.me","2710user");
//
       LoginPage login = new LoginPage(driver);
       login.loginAs("testuser2710", "2710user");
        
        DeleteRepository delete = new  DeleteRepository(driver);
        delete.repositoryDelete();
//        
		
		
    }
}     