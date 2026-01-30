package attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo_data_provider
{
@DataProvider(name="madhu")
public Object[][] dataProviderMethod()
{
	return new Object[][] {{"1.venna"},
		{"2.ankitha"},{"3.harika"}};
		
	}
	@Test(dataProvider="madhu")
	public void testMethod(String data)
	{
		System.out.println("data is: "+data);
	}
}

