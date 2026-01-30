package driver_maven;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample_web {
public static void main(String[] args) throws InterruptedException
{
	System.out.println("hello madhu and welcome");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Thread.sleep(2000);
	String pagetitle=driver.getTitle();
	System.out.println(pagetitle);
	driver.quit();
}
}
