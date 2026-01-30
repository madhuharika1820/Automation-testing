package driver_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo_dropdown {
public static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	
	WebElement drpdown=driver.findElement(By.name("country"));
	Select s=new Select(drpdown);
	s.selectByVisibleText("INDIA");
	Thread.sleep(3000);
	
	boolean mdisplaced=drpdown.isDisplayed();
	boolean mEnabled=drpdown.isEnabled();

	
	s.selectByIndex(1);
	Thread.sleep(3000);
	
	s.selectByValue("ALGERIA");
	Thread.sleep(3000);
	
	System.out.println(mdisplaced);
	System.out.println(mEnabled);
	driver.quit();

}
}
