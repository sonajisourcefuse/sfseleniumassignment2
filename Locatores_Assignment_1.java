package sf_assignment_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatores_Assignment_1 {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement enterEmail= driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		enterEmail.sendKeys("9822670333");
		WebElement enterPassword= driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		enterPassword.sendKeys("9822670333");
		WebElement loginBtn= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		loginBtn.click();

		/*Cart = //span[text()='Cart']
			Become a Seller = //a[@class='_3-PJz-']*/
	}

}
