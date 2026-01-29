package stepdefinitions1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class google {
WebDriver driver;

@Given("browser is open")
public void browser_is_open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Given("user is on google search page")
public void user_is_on_google_search_page() {
	driver.navigate().to("https://www.google.com/");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user enters a text in search page")
public void user_enters_a_text_in_search_page() throws InterruptedException{
	driver.findElement(By.name("q")).sendKeys("India");
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
    
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
    	//.getPageSource();
    	//driver.quit();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
