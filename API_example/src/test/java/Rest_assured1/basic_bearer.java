package Rest_assured1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class basic_bearer {

	@Test(enabled=true)
	public void one() {
		RestAssured.baseURI="https://api.github.com";
		RestAssured.basePath="users/madhuharika1820/repos";
		
		RequestSpecification requestspec =RestAssured.given();
		requestspec.header("Authorization","Bearer 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");
		
		Response response=requestspec.get();
		
		JsonPath jsonpath=response.jsonPath();
		String reposname=jsonpath.getString("name");
		
		System.out.println(reposname);
		Assert.assertEquals(response.statusCode(), 200);
	}
}
