package sdet.apiautomationassessment;



import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

/*Question2: Add test suite, test case and test step for testing webservice API*/

public class APITestSuiteQuestion2 {

	@Test
	public void testCountryAPI() {
		// Test Case: Get all countries
		Response response = given().when().get("https://restcountries.com/v3.1/all").then().statusCode(200) // Assert
				// status
				// code is
				// 200
				.extract().response();

		// Test Step: Verify response body contains data
		response.then().body("size()", greaterThan(0));
	}

	@Test
	public void testSpecificCountry() {
		// Test Case: Get specific country
		Response response = given().pathParam("countryCode", "USA").when()
				.get("https://restcountries.com/v3.1/alpha/{countryCode}").then().statusCode(200) // Assert status code
				// is 200
				.extract().response();

		// Test Step: Verify response body contains country details
		response.then().body("name", equalTo("United States"));
	}
}
