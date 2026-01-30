package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.loginpage;

public class loginpage_test {
public static void main(String[] args)
{
	WebDriver driver;
	loginpage loginpage;
	
	driver=new ChromeDriver();
	loginpage=new loginpage(driver);
	
//	loginpage.navigateTo();
//	loginpage.login("standard_user", "secret_sauce");
	
	loginpage.navigateTo();
	loginpage.login("invalid_user", "wrong_password");
	
	System.out.println(loginpage.geterrormessage());

//driver.quit();
}
}
