package Rest_assured1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class basic_auth {

	@Test
	void demo1()
	{
		RestAssured.baseURI="htpps://api.github.com";
		String ma="/users/madhuharika1820/repos";
		String token="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";
		
		ResponseOptions res2=(ResponseOptions) RestAssured
				.given()
				.auth().oauth2(token)
				.get(ma).getBody();
		System.out.println(res2.toString());
	}
}
