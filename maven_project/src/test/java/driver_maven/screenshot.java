package driver_maven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
WebDriver driver;
public static void main(String[] args)throws InterruptedException,IOException
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("/home/labuser/Desktop/Project/test.png"));
}
}
