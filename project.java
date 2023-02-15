package selenimu1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://in.bookmyshow.com/explore/home/chennai");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[text()='Raangi']")).click();
			Thread.sleep(2000);
			WebElement f = driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]"));
			f.click();
			
			Thread.sleep(2000);
//     		driver.findElement(By.xpath("(//div[text()='4K DOLBY 7.1'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//div[text()='Accept'])[1]")).click();
//			
//			driver.findElement(By.xpath("(//div[@id='proceed-Qty'])[1]")).click();
//			driver.findElement(By.xpath("(//a[@class='_available'])[6]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//a[@id='btmcntbook'])[1]")).click();
//			driver.findElement(By.xpath("//a[@id='payLat']")).click();
//			Thread.sleep(2000);
//			TakesScreenshot t = (TakesScreenshot) driver;
//			File screen = t.getScreenshotAs(OutputType.FILE);
//			File dest = new File("C:\\Users\\abc\\eclipse-workspace\\Selenium\\screenshot\\home.png");
//			FileHandler.copy(screen, dest);
			
			
			
			
			
			
	}
}
