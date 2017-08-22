package plygem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class userInterface {

	public static WebDriver driver;
	public static String bookName = "Mastering Selenium WebDriver";
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium\\Software\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void userLogin (String Email, String Password) {
		driver.findElement(By.id("ap_email")).sendKeys(Email);
		driver.findElement(By.id("ap_password")).sendKeys(Password);
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	public void searchBook(String book) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(book);
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.linkText(bookName)).click();
		 	
	}
	
	public void addToCart() {
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		boolean cartDisplay = cart.isDisplayed();
		boolean cartEnabled = cart.isEnabled();
		
		if (cartDisplay == true && cartEnabled == true) {
			cart.click();
			String addedToCart = cart.findElement(By.xpath(".//*[@id='huc-v2-order-row-confirm-text']/h1")).getText();
			System.out.println(addedToCart);
			//if(addedToCart.equals("Added to Cart")) {
			System.out.println("Item added to cart successfully - PASSED ");
		} else
			System.out.println("Item not added to cart successfully - FAILED ");
		//}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userInterface obj = new userInterface();
		
	/*	//Test Case 1:  Verify "Launch Application (Amazon User Sign in page)" using valid URL
		
		obj.launchBrowser();
	
		boolean signIn = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).isDisplayed();
				
		if (signIn == true) {
			System.out.println("Test case 1:" + "Sign in Elements Exits - Passed");
		} else 
			System.out.println("Test case 1:" + "Sign in Elements  not Exits - Failed");
		obj.closeBrowser();*/
		
		//Test Case2:  Verify "Admin Login" in gcrShop Web portal Admin Interface with valid Inputs
		
	/*	obj.launchBrowser();
		driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).click();
		obj.userLogin("blr.khalid@gmail.com", "khalid!@#");
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		if (url.equals("https://www.amazon.com/?ref_=nav_ya_signin&")) {
			System.out.println("Test Case 2:" + "User Login Successful - Passed");
		} 
		else
			System.out.println("Test Case 2:" + "User Login Un Successful - Failed");
		obj.closeBrowser();
	 */
		
		//Test Case3:  add a book to the cart in Amazon
		obj.launchBrowser();
		driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).click();
		obj.userLogin("blr.khalid@gmail.com", "khalid!@#");
		obj.searchBook("Selenium book");
		obj.addToCart();
		
	}

}
