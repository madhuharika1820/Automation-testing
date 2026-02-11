package exam2_stepdefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

   @RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/run",
	glue= {"exam2_stepdefinitions"},monochrome=true,
	plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports"})

	public class test_runner_exam  extends AbstractTestNGCucumberTests{

	}


