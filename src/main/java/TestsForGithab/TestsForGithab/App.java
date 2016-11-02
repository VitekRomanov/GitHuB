package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); //путь к твоему chromedriver.exe
        WebDriver driver = new ChromeDriver();

        driver.get("https://github.com//join?source=header-home");
        
        TestRegistration registr = new TestRegistration(driver);
        registr.RegistrAs("testuser27103", "jbhuuhardodb@dropmail.me","2710user");
    }
}     