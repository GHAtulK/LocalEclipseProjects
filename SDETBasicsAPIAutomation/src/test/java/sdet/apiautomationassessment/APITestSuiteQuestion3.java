package sdet.apiautomationassessment;




import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

/*
 * Question3: Verify the different name from the response. For example if we
 * pass united name as “United States” like
 * https://restcountries.com/v3.1/name/united in the API URL, we should get
 * “Americas” as region in the response.
 */

public class APITestSuiteQuestion3 {

	@Test
	public void testGetRegionForUnitedStates() {
		// Test Case: Verify region for United States
		Response response = given()
				.queryParam("name", "united")
				.when()
				.get("https://restcountries.com/v3.1/name")
				.then()
				.statusCode(200) // Assert status code is 200
				.extract().response();

		// Test Step: Verify response body contains region as "Americas"
		response.then().body("[0].region", equalTo("Americas"));
	}
}
