package Rest_assured1;


	//import org.junit.Test;
	import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	public class rest_demo {

		@Test(enabled=true)
		void rest_demo()
		{
			baseURI="https://reqres.in/api";
			
			given().header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63")
			.get("/users?page=2")
			.then().statusCode(200).log().all();
			
		}
		
		@Test(enabled=false)
		void rest_demo1()
		{
			RequestSpecification httpRequest=RestAssured.given();
			httpRequest.header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63");
			httpRequest.baseUri("https://reqres.in/api");
			Response response=httpRequest.get("/users?page=2");
			
			System.out.println(response.getBody().asString());
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			System.out.println(response.getHeader("content-type"));
			
			int code=response.getStatusCode();
			Assert.assertEquals(code, 200);
			
		}
		
		@Test(enabled=false)
		void rest_demo2()
		{
			baseURI="https://reqres.in/api";
			
			given().header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63")
			.get("/users?page=2")
			.then().statusCode(200)
			.body("data[0].first_name",equalTo("madhu"))
			.body("data.first_name",hasItems("madhu","harika"));
			
		}
		
		@Test(enabled=false)
		void rest_demo3()
		{
			JSONObject request=new JSONObject();
			request.put("name", "madhu");
			request.put("job", "software tester");
			
			given().
			header("Content-Type","application/json").
			header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63").
			body(request.toJSONString()).
			when().put("https://reqres.in/api/users/2").
			then().
			statusCode(200).log().all();
			
		}
	}


