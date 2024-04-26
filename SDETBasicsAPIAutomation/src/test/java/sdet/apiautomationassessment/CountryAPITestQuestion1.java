package sdet.apiautomationassessment;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/*
 * Question1: Webservice API testing using SOAP UI. API URL:
 * https://restcountries.com/v3.1/all
 *
 * Create a rest project using the above rest service API in Java using
 * RestAssured
 */

public class CountryAPITestQuestion1 {

	@Test
	public void testGetAllCountries() {
		// Set base URI
		RestAssured.baseURI = "https://restcountries.com";

		// Perform GET request to fetch all countries
		Response response = given()
				.when()
				.get("/v3.1/all")
				.then()
				.statusCode(200) // Ensure status code is 200
				.extract().response();

		// Assert response body contains data
		response.then().body("size()", greaterThan(0));
	}
}