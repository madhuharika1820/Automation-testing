package stepdefinitions1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpage {

WebDriver driver;
	
@Given("browser1 is open")
public void browser1_is_open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();

    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("browser is login")
public void browser_is_login() {
	driver.navigate().to("https://www.saucedemo.com/");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("^enter login details(.*)and(.*)")
public void enter_login_details_username_and_password(String username,String password) throws InterruptedException {
	driver.findElement(By.name("user-name")).sendKeys(username);
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys(password);


	 // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("page navigate to website")
public void page_navigate_to_website() {
	driver.findElement(By.name("login-button")).click();
	driver.quit();

    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}}
