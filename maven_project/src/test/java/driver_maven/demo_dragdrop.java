package driver_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo_dragdrop {
public static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(5000);
	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
	WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

	Actions a=new Actions(driver);
	a.dragAndDrop(From,To).build().perform();
	//driver.quit();

}
}
