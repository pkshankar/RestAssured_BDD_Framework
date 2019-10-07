package com.qa.test;

import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.pojo.BookingDatesPojo;
import com.qa.pojo.UserDetailsPojo;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class PostUserDetails {

	@Test
	public void postUserDetails() throws JsonProcessingException {

		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType("application/json");
		BookingDatesPojo bd = new BookingDatesPojo("2018-01-01", "2019-12-12");
		UserDetailsPojo ud = new UserDetailsPojo("Jon", "Hawk", 500, true, "wifi", bd);
		ObjectMapper mapper = new ObjectMapper();
		String jsonPayload = mapper.writeValueAsString(ud);
		httpRequest.body(jsonPayload);
		System.out.println(jsonPayload);
		
	}

}
