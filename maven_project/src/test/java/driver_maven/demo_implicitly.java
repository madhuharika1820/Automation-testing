package driver_maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_implicitly {
public static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/dynamic-properties");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	System.out.println(driver.findElement(By.id("visibleAfter")).getText());
	
	driver.quit();
	}
}
