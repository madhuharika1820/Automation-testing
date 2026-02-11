package parameters_demo;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class pathparam_ex {

	@Test
	void demo1()
	{
		baseURI="https://reqres.in/api";
		
		given().header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63")
		
		.pathParam("resource","users")
		.queryParam("page",2)
		
		.get("/{resource}")
		.then().statusCode(200)
		.body("data[0].first_name",equalTo("madhu"))
		.body("data.first_name",hasItems("madhu","harika"));
	}
}
