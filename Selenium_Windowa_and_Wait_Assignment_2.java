package sf_assignment_1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Windowa_and_Wait_Assignment_2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		String primWinId = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Set<String> allWinId= driver.getWindowHandles();
		for(String eachWinId: allWinId) {
			if(!eachWinId.equals(primWinId)) {
				driver.switchTo().window(eachWinId);
				driver.manage().window().maximize();
				String  wiN2URL= driver.getCurrentUrl();
				System.out.println(wiN2URL);
				String winText = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(winText);
				Thread.sleep(2000);
				driver.switchTo().window(primWinId);
			}
			try {
				String parentWinTitle= driver.getTitle();
				System.out.println("Title : "+parentWinTitle);
			}
			catch(WebDriverException ch) {

			}
		}
		driver.quit();
	}

}
