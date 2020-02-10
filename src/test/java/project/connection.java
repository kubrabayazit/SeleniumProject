package project;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class connection {

	
static WebDriver driver;
	
	@BeforeClass
	public static void Login() {
		System.setProperty("webdriver.chrome.driver", "Users\\MacintoshHD\\Applications");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver( options );
		driver.get("https://www.n11.com/");
		
	}
	@AfterClass
	public static void Close() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
