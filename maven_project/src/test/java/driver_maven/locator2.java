package driver_maven;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator2
{
public static void main(String[]args) throws InterruptedException
{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Thread.sleep(2000);
	WebElement sb=driver.findElement(By.name("q"));
	sb.sendKeys("india");
	sb.sendKeys(Keys.ENTER);
	String actualUrl=driver.getCurrentUrl();
	System.out.println(actualUrl);
	Thread.sleep(10000);

	driver.quit();
}}
