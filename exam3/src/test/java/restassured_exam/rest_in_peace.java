
package restassured_exam;
import org.testng.annotations.DataProvider;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class rest_in_peace {
	
	    
	    @DataProvider(name = "userid")
	    public Object[][] userid() {
	        return new Object[][] {
	            {1},
	            {2},
	            {3}
	        };
	    }
	

	
	@Test(dataProvider = "userid")
	void rest_demo2(int userid)
	{
		RestAssured.baseURI="https://reqres.in/api";
		
		given().header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63")
		.pathParam("id",userid)
		//.get("/users?page=2")
		.when().get("/api/users/{id}")
		.then().statusCode(404);
		//.body("data[0].first_name",equalTo("madhu"))
		//.body("data.first_name",hasItems("madhu","harika"));
	}
}
    


         
       

