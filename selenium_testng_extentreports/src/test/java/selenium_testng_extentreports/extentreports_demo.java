package selenium_testng_extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreports_demo {

	static ExtentReports extent;
	static ExtentSparkReporter spark;
	
	@BeforeClass
	public void starttest()
	{
		extent =new ExtentReports();
		spark=new ExtentSparkReporter("target/Spark.html");
	}
	@Test
	public void extentest()
	{
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("AutomationReport");
		spark.config().setReportName("ReportDemo");
		
		extent.attachReporter(spark);
		
		//create a test node in the report
		ExtentTest test=extent.createTest("login test").assignAuthor("madhu").assignCategory("smoke").assignDevice("chrome");
		test.pass("login test successfull");
		test.info("url loaded");
		test.pass("login test completed successfully");
		
		//create a test node in the report
		ExtentTest test1=extent.createTest("HomePage test").assignAuthor("madhu").assignCategory("regression").assignDevice("chrome");
		test1.pass("homepage is successfull");
		test1.info("value entered");
		test1.fail("homepage test fails");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle().equals("google1"))
		{
			test1.log(Status.PASS,"navigated to the specified URL");
		}
		else
			driver.quit();
		
	}
	@AfterMethod
	public void teardown()
	{
		extent.flush();
	}
}




