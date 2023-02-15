package selenimu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class act {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
//		WebElement cl = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		Actions ref = new Actions(driver);
//    	ref.doubleClick(cl).build().perform();
//		
//    	WebElement rig = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
//		ref.contextClick(rig).build().perform();

		WebElement c = driver.findElement(By.xpath("//button[text()='Click Me']"));
		ref.click(c).build().perform();
	
//		 driver.navigate().to("https://www.myntra.com/");
//		
//		WebElement f = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
//		ref.moveToElement(f).build().perform();
//		
		
		
}
}
