package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPageFactor;

public class pageFactorTest {
	public static void main(String[] args)
	{
		WebDriver driver;
		LoginPageFactor loginpage;
		
		driver=new ChromeDriver();
		LoginPageFactor=new LoginPageFactor(driver);
		
//		loginpage.navigateTo();
//		loginpage.login("standard_user", "secret_sauce");
		
		loginpage.navigateTo();
		loginpage.login("invalid_user", "wrong_password");
		
		System.out.println(loginpage.geterrormessage());

	//driver.quit();
	}
	}

