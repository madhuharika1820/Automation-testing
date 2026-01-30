package attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert {
	 @Test
	  public void f() {
		  
	  String actual_result="madhu";
	  String expected_result="harika";
	  Assert.assertEquals(actual_result,expected_result);
//Assert.assertEquals("madhu","harika");

	  Assert.assertTrue(5<3,"error");
	  System.out.println("-----A----");
	  Assert.fail("errorrrr");
	  System.out.println("----B---");
	 }
	 
}
