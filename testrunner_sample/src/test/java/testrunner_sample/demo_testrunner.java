package testrunner_sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/run",
glue= {"testrunner_sample"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports"})

public class demo_testrunner extends AbstractTestNGCucumberTests{

}
