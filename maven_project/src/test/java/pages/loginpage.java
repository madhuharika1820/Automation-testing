package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	private WebDriver driver;
	private final String url="http://www.saucedemo.com/";
	
	//locators
	private By usernameField=By.id("user-name");
	private By passwordField=By.id("password");
	private By loginButton=By.id("login-button");
	private By errormessage=By.cssSelector("h3[data-test='error']");

	//constructor
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
//navigate to login page

public void navigateTo()
{
	if(!driver.getCurrentUrl().equals(url))
			{
		driver.get(url);
			}
}

//perform login action

public void login(String username,String password)
{
	driver.findElement(usernameField).sendKeys(username);
	driver.findElement(passwordField).sendKeys(password);
	driver.findElement(loginButton).click();
}

public String geterrormessage()
{
	return driver.findElement(errormessage).getText();
}
}





