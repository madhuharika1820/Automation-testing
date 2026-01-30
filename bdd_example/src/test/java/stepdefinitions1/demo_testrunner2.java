package stepdefinitions1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature1/google",
glue= {"stepdefinitions1"},monochrome=true,
plugin= {"pretty","html:target/HtmlReports.html","json:target/JSONReports"})

public class demo_testrunner2 extends AbstractTestNGCucumberTests{

}
