package GOREST_API.gorest_api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class get_request {
	@Test
	void Get_records() {

		RestAssured.baseURI="https://gorest.co.in/";
		RequestSpecification request  = RestAssured.given();
		Response response = request.get("public/v1/users/1445");
		
		response.getBody().prettyPrint();
		



	}}


