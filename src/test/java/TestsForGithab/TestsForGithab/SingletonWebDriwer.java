package TestsForGithab.TestsForGithab;

import org.openqa.selenium.WebDriver;

public class SingletonWebDriwer {
	
    private static SingletonWebDriwer webDriver = null;
    private SingletonWebDriwer(){
    	driver = new SingletonWebDriwer();
    }
	
	private static SingletonWebDriwer driver;
		
	public static synchronized SingletonWebDriwer getInstance() {
		if (driver == null) {
			WebDriver  driver;
			webDriver = new SingletonWebDriwer();
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
			driver = (WebDriver) new SingletonWebDriwer();
			driver.get("https://github.com");
		}
		return driver;
	}


	public SingletonWebDriwer getSingletonWebDriwer(){
    return driver;
}

}
