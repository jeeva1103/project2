package selenimu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		Actions r = new Actions(driver);
		
		
		WebElement f = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		r.clickAndHold(f).build().perform();
	    r.moveToElement(f, 300, 0).build().perform();
	    
	    //drag drop
	    
	    WebElement d = driver.findElement(By.xpath("//div[@id='form:drag']"));
	    WebElement d1 = driver.findElement(By.xpath("//div[@id='form:drop']"));
		r.clickAndHold(d).build().perform();
		r.dragAndDrop(d, d1).build().perform();
		
		
		
		
		
		
		
		
		
		
}
}
