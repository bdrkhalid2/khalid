package Testngexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
	
	public static WebDriver driver;
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium\\Software\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.close();
		
	}
}
