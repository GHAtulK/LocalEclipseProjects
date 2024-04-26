package sdet.apiautomationassessment;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

/*Question 4: Make use of assertions to verify the response.
Note: We can get the united from the below API
https://restcountries.com/v3.1/name/united
Reference API website: https://restcountries.com/#api-endpoints-v3-all*/

public class APITestSuiteQuestion4 {

	@Test
	public void testGetCountryDetails() {
		// Test Case: Verify response for querying "united"
		Response response = given().when().get("https://restcountries.com/v3.1/name/united").then().statusCode(200) // Assert
				// status
				// code
				// is
				// 200
				.extract().response();

		// Test Step: Verify response body contains expected data
		response.then().body("[0].name", equalTo("United States")) // Assert name is "United States"
		.body("[0].region", equalTo("Americas")) // Assert region is "Americas"
		.body("[0].subregion", equalTo("Northern America")); // Assert subregion is "Northern America"
	}
}
