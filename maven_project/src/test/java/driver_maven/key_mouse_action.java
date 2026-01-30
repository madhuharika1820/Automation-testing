package driver_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key_mouse_action {
public static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().minimize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement m=driver.findElement(By.cssSelector("textarea#APjFqb"));
	System.out.println("test");
	Actions a=new Actions(driver);
	a.moveToElement(m).click();
	a.keyDown(Keys.SHIFT);
	a.sendKeys("India").keyUp(Keys.SHIFT).build().perform();
	a.contextClick().perform();
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
