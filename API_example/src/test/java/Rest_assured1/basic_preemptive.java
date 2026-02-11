package Rest_assured1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class basic_preemptive {

	@Test(enabled=false)
	public void basic_auth1()
	{
		RestAssured.baseURI="http://postman-echo.com";
		String response = given().log().all().auth()
		.preemptive().basic("postman","password")
		.when().get("basic-auth")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println(response);
	}
	@Test(enabled=false)
	public void basic_auth2()
	{
		given()
		.auth()
		.preemptive()
		.basic("username","password")
		.when()
		.get("https://reqres.in/api")
		.then()
		.log().all().statusCode(200);
	}
	@Test(enabled=true)
	public void basic_auth3()
	{
		RestAssured.baseURI="http://postman-echo.com";
		String response=given().log().all().auth().basic("postman","password").when().get("basic-auth")
				.then().log().all().assertThat().statuscode(200).extract().response().asString();
		
		System.out.println(response);
	}
}

