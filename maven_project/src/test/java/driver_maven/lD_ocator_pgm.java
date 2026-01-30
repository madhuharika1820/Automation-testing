package driver_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lD_ocator_pgm {
public static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.saucedemo.com/");
	Thread.sleep(2000);
	
	WebElement user=driver.findElement(By.id("user-name"));
	user.sendKeys("standard_user");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	WebElement loginbtn=driver.findElement(By.id("log in"));
	loginbtn.click();
	driver.quit();

}
}
