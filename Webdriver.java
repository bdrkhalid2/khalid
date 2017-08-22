package plygem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Webdriver {
	public static WebDriver driver;
	
	@BeforeSuite
	public void webDriver() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium\\Software\\geckodriver-v0.18.0-win32\\geckodriver.exe");
	driver = new FirefoxDriver();
	}
	
}
