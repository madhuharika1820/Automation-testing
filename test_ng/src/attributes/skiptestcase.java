package attributes;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestcase {
boolean flag=true;
@Test
public void m()
{
	if(flag)throw new SkipException("Custom error: skip the test");
	System.out.println("madhu");
}
}
