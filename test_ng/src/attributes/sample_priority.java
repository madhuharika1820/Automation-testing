package attributes;

import org.testng.annotations.Test;

public class sample_priority {
	@Test(priority=2)
	  public void f()
	{
		  System.out.println(" first testcase");
	  }
	  @Test
	  public void f1() {
		  System.out.println("second testcase");
	  }}

