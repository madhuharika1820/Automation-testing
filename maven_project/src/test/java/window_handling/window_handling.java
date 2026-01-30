package window_handling;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

	public class window_handling {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		String initialHandle=driver.getWindowHandle();
//open a new tab and navigate to another url		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
//ensure there are two windows open(main window+new tab)		
		System.out.println(driver.getWindowHandles().size());
//Switch back to the original window(main window)		
		driver.switchTo().window(initialHandle);
        Thread.sleep(3000);
//close the main window
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		
		driver.quit();

		
	}
	}

