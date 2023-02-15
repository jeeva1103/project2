package selenimu1;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demokey {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String w = driver.getWindowHandle();
		System.out.println(w);
		
		Actions re = new Actions(driver);
		WebElement ri = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		re.contextClick(ri).build().perform();

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
		
	    //enter
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fin = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
		re.contextClick(fin).build().perform();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> a = driver.getWindowHandles();
	     for (String s : a) {
	    	 Thread.sleep(2000);
         String title = driver.switchTo().window(s).getTitle();
	     System.out.println(title);
	     }
        		
		String c = "Help - Amazon Customer Service";
		for (String string : a) {
			if (c.equals(string)) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
