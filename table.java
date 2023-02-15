package selenimu1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();
			
			List<WebElement> k = driver.findElements(By.tagName("tr"));
			for (WebElement web : k) {
				System.out.println(web.getText());
			}
			
//			List<WebElement> find = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
//			for (WebElement w : find) {
//				System.out.println(w.getText());
//			}
//			System.out.println("row");
//			List<WebElement> i = driver.findElements(By.xpath("(//table)[1]/tbody/tr[4]/td"));
//			for (WebElement web : i) {
//				System.out.println(web.getText());
//			}
//			System.out.println("column");
//			List<WebElement> we = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td[3]"));
//			for (WebElement ele : we) {
//				System.out.println(ele.getText());
//			}
//			System.out.println("row  column");
//			WebElement eleme = driver.findElement(By.xpath("(//table)[1]/tbody/tr[7]/td[2]"));
//			for (WebElement ss : we) {
//				System.out.println(ss.getText());
//			}
//			WebElement element = driver.findElement(By.xpath("(//table)[1]/tbody/tr/th[2]"));
//			for (WebElement webElement : we) {
//				System.out.println(webElement.getText());
//			}
			
			
			
			
			
}
}