package selenimu1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.cssSelector("input[id='email']")).sendKeys("9003187960");
driver.findElement(By.cssSelector("[name$='ss']")).sendKeys("9361072941");
driver.findElement(By.linkText("Log in")).click();












}
}
