/*package Rest_assured1;




import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class rest_in_peace {
    // STEP 1: Set Base URI
    static {
        baseURI = "https://reqres.in";
        
        given().header("x-api-key","reqres_23f07a574b424b10a0a5cb97077d0e63")
    	.get("/users?page=2")
    	.then().statusCode(200).log().all();
    }

    // STEP 2: DataProvider supplying multiple user IDs
    @DataProvider(name = "userIds")
    public Object[] getUserIds() {
        return new Object[] {1, 2, 3};
    }

    // STEP 3: Test using DataProvider
    @Test(dataProvider = "userIds")
    public void validateUser(int id) {
    	

        given()

        .when()
            .get("/api/users/" + id)

        .then()
            .statusCode(200)                 // Validate status
            .body("data.id", equalTo(id));   // Validate correct user returned
    }

}*/



//In UserDataProvider.java




/*public class UserDataProvider {
 @DataProvider(name = "userIds")
 public Object[][] userIds() {
     return new Object[][] {
         {1},
         {2},
         {3}
     };
 }
}
*/
package Rest_assured1;
import org.testng.annotations.DataProvider;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class rest_in_peace {
	
	

    private static final String BASE_URI = "https://reqres.in";
    private static final String API_TOKEN = "reqres_23f07a574b424b10a0a5cb97077d0e63";  
@Test(dataProvider = "userIds", dataProviderClass = dataprovider_exam.class)
    public void validateUserDetails(int userId) {
        Response response = RestAssured.given()
                .baseUri(BASE_URI)
                .header("Authorization", "Bearer " + API_TOKEN)  
                .when()
                .get("/api/users?page=2" + userId)
                .then()
                .extract().response();

        //.get("/users?page=2")   
        response.then()
                .statusCode(200)  // Check that status code is 200
                .body("data.id", equalTo(userId))  // Validate that the ID matches the user ID
                .body("data.email", notNullValue())  // Validate that the email is not null
                .body("data.first_name", notNullValue())  // Validate that first_name is not null
                .body("data.last_name", notNullValue());  // Validate that last_name is not null
    }
}


