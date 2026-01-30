package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googlesearchpage;

public class googleTestClass {
static WebDriver driver;
public static void main (String[] args)
{
	googlesearch();
	//driver.quit();
}
public static void googlesearch()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	googlesearchpage.textbox_search(driver).sendKeys("India");
	googlesearchpage.textbox_search(driver).sendKeys(Keys.ENTER);
}
}
