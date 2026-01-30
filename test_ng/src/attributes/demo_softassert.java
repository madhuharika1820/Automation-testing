package attributes;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class demo_softassert {
@Test
void f()
{
	String actual_result="madhu";
	String expected_result="harika";
	
	SoftAssert st=new SoftAssert();
	st.assertEquals("madhu","harika");
	st.assertTrue(5>11,"error");
	
	st.assertAll();
}
}
