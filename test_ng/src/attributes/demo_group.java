package attributes;

import org.testng.annotations.Test;

public class demo_group {
	@Test(groups= {"Madhu"})
	  public void f() {
		  System.out.println(" first testcase");
	  }
	  @Test
	  public void f1() {
		  System.out.println("second testcase");
	  }}

