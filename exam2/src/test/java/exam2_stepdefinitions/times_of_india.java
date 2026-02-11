package exam2_stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class times_of_india {

	WebDriver driver;
    Given("user opens Times Of India website")
	public void user_opens_times_of_india_website() {
	    // Write code here that turns the phrase above into concrete actions
	   driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://timesofindia.indiatimes.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
	   
	}

	@When("user selects hindi language")
	public void user_selects_hindi_language() {
	    
		WebElement Drop_down = driver.findElement(By.xpath("//*[@class='z89UZ undefined xGzbZ']"));
		Select sc = new Select(Drop_down);
		sc.selectByVisibleText("English");
		sc.deselectByIndex(1);
		
	}

	@Then("hindi page should be displayed")
	public void hindi_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		driver.navigate().back();
		driver.quit();
	}


}
