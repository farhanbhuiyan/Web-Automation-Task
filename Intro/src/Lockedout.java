

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lockedout {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        if (errorMessage.getText().equals("Sorry, this user has been locked out.")) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }

	}

}
