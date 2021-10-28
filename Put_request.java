package GOREST_API.gorest_api;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_request {
	@Test
	void PUT_ReQUEST() {
		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given();
	 JSONObject update = new JSONObject();
	 update.put("name", "bullet");
	 update.put("email", "hemanthsai1443@gmail.com");
	 update.put("gender","Male");
	 update.put("status","inactive");
	 
	request.header("Content-Type","application/json");
	request.body(update.toJSONString());
	Response response = request.put("public/v1/users/1445?access-token=aa9bc4b833f5da1be45b9b064c993dea1e24d3d39983d9780dc1ee37800d2d3a");
	System.out.println(response.getBody().asPrettyString());
	int statuscode = response.statusCode();
	System.out.println(statuscode);
		
		
	}

}
