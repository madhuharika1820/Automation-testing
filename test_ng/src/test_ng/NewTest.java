package test_ng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f1() {
	  System.out.println("---new testcase---");
  }
  @Test
  public void f2() {
	  System.out.println("---new testcase--");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("---beforeMethod--");
  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("----aftermethod---");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("---beforeclass---");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("----afterclass--");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("-----beforetest---");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("-----aftertest---");
  }

}
