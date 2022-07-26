package sf_assignment_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		//a) open https://www.flipkart.com using firefox browser.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement enterEmail= driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']"));
		enterEmail.sendKeys("9822670333");
		WebElement enterPassword= driver.findElement(By.xpath("//span[text()='Enter Password']"));
		enterPassword.sendKeys("9822670333");
		WebElement loginBtn= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		loginBtn.click();
				
	}

}
