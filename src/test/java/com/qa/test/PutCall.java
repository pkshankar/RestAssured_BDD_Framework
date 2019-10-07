package com.qa.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.pojo.CreateUserPojo;

import io.restassured.RestAssured;

public class PutCall {
	
	@Test
	public void putTest() throws JsonProcessingException {
		
		CreateUserPojo ob = new CreateUserPojo("admin", "password123");
		ObjectMapper mapper = new ObjectMapper();
		String jsonOb = mapper.writeValueAsString(ob);
		RestAssured.baseURI="https://restful-booker.herokuapp.com";
		given().log().all()
			.body(jsonOb)
			.contentType("application/json")
		.when().log().all()
			.post("/auth")
		.then()
			.log().all();
			
	}

}
