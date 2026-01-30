package attributes;

import org.testng.annotations.Test;

public class sample_timeout {
	@Test
	  public void f() {
		  System.out.println(" first testcase");
	  }
	  @Test(timeOut=200)
	  public void f1() throws InterruptedException {
	   Thread.sleep(500);
		  System.out.println("second testcase");
	  }
	@Test

		  public void f2() {
			  System.out.println(" third testcase");
		  }
	  } 
