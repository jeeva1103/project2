package selenimu1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class project2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		WebElement f = driver.findElement(By.xpath("//select[@title='Search in']"));
         Select s = new Select(f);
		s.selectByVisibleText("Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);
			WebElement 	ff = driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]"));
			System.out.println(ff.getText());
			ff.click();
			driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
			driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9361072941");
			driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jeevanandam");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//span[text()='Cash On Delivery/Pay On Delivery'])[2]")).click();
			driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
			
			driver.findElement(By.xpath("(//input[@name='placeYourOrder1'])[3]")).click();
			
			driver.findElement(By.xpath("//span[text()='Review or edit your recent orders']")).click();
			
			driver.findElement(By.xpath("(//a[@role='button'])[3]")).click();
			
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			
			
			
}
}