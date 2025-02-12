import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;


public class Login {
	
	private WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//System.out.println(driver.getCurrentUrl());
		//String actualTitle = driver.getCurrentUrl();
		assertTrue(driver.getTitle().contains("https://www.saucedemo.com/inventory.html"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.quit();

	}
	
	public void negativelogin() {
		
	
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("wrong_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	

	}


	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}
}
