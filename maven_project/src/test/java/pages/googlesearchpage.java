package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class googlesearchpage {
private static WebElement element= null;
public static WebElement textbox_search(WebDriver driver)
{
	element=driver.findElement(By.name("q"));
	return element;
}
}
