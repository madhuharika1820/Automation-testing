package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactor {
	
	private WebDriver driver;
	private final String url="http://www.saucedemo.com/";
	
	//web elements using @findby
	@FindBy(id="user-name")
	private WebElement UsernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy (id="login-button")
	private WebElement loginButton;
	
	@FindBy(css="h3[data-test='error']")
	private WebElement errormessage;
	
	//constructor
			public LoginPageFactor(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			

public void navigateTo()
{
	if(!driver.getCurrentUrl().equals(url))
			{
		driver.get(url);
			
}
}
}

	
	
	
	
