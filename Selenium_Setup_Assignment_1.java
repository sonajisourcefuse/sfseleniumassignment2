package sf_assignment_1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Setup_Assignment_1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
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
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBox.click();
		searchBox.sendKeys("iphone 12 mini 128bg");
		driver.findElement(By.xpath("//button['L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Green, 128 GB)']")).click();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		String priWinID= driver.getWindowHandle();
		Set<String> allWinID = driver.getWindowHandles();
		for(String eachID: allWinID) {
			if(!eachID.equals(priWinID)) {
				driver.switchTo().window(eachID);	
			}	
		}
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	    String addToCartText = addToCart.getText();  
	    WebElement goToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	    String goToCartText = goToCart.getText(); 
	    if(addToCartText.equals("ADD TO CART")) {
	    	addToCart.click();
	    }
		
	    else {
	    	goToCart.click();
	    }
	    
		WebElement placaOrder = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
		placaOrder.click();
	}
}
