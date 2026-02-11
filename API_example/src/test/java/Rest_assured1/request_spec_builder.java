package Rest_assured1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class request_spec_builder {

	@Test
	void demo1()
	{
        RequestSpecBuilder reqBuilder=new RequestSpecBuilder();
		reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
		reqBuilder.setBasePath("/booking");
		
         RequestSpecification reqSpec=  reqBuilder.build();

		System.out.println("------------------");
		
		Response res2=RestAssured.given(reqSpec).get();
		System.out.println(res2.asString());
		System.out.println("-----------");
	}
}
