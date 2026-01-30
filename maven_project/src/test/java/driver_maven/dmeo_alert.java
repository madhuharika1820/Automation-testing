package driver_maven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dmeo_alert {
public static void main(String[] args)throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.name("cusid")).sendKeys("12345");
	driver.findElement(By.name("submit")).submit();
	
	Alert alert=driver.switchTo().alert();
	String alertMessage=driver.switchTo().alert().getText();
	System.out.println(alertMessage);
	//alert.accept();
}
}
