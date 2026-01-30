package driver_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_cssSelectors {
public static void main(String[]  args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.saucedemo.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("input#login-button")).click();
	Thread.sleep(4000);
	
	driver.quit();
}
}
