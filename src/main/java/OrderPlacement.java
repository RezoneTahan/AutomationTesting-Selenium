import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderPlacement {

	public static void main(String[] args) {
		
		// Browser Driver initialization
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		//Test case #1: Verify login functionality of Swag labs
		driver.get("https://www.saucedemo.com/checkout-step-two.html");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Test case #2: Order Placement of Swag labs
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Rezone");
		driver.findElement(By.id("last-name")).sendKeys("Tahan");
		driver.findElement(By.id("postal-code")).sendKeys("abc123");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.close();
		
	}
	
}
		
