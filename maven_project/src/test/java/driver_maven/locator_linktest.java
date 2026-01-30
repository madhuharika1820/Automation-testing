package driver_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_linktest {
public static void main(String[]args)throws InterruptedException
{
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("http://www.google.com");
//	Thread.sleep(2000);
//	System.out.println(driver.getTitle());
//	driver.findElement(By.linkText("Gmail")).click();
//	driver.navigate().back();
//	driver.quit();
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://www.google.com");
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Gmail")).click();
	driver.navigate().back();
	driver.quit();
}
}
