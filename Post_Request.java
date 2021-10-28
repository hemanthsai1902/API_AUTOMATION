package GOREST_API.gorest_api;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Request {
	@Test()
	void Addr_ecords() {
		RestAssured.baseURI="https://gorest.co.in/";
		
		RequestSpecification request=RestAssured.given();
		
		JSONObject s=new JSONObject();
		s.put("name","hemanthsai");
		s.put("email","hemanthsai1@gmail.com");
		s.put("gender","Male");
		s.put("status","active");
		System.out.println(s.toJSONString());
		
	  request.header("Content-Type","application/json");
	 request.body(s.toJSONString());
	  Response response = request.post("public/v1/users?access-token=aa9bc4b833f5da1be45b9b064c993dea1e24d3d39983d9780dc1ee37800d2d3a");
	  System.out.println(response.getBody().asPrettyString());
	  int statusCode = response.statusCode();
	  System.out.println(statusCode);
	}
	
	

}
