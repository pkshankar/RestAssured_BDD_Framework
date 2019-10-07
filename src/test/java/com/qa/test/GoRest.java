package com.qa.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GoRest {

	@Test
	public void getUserInfo() {

		 RestAssured.baseURI="https://gorest.co.in";
		given().log().all()
			.queryParam("first_name", "Dana")
			.queryParam("dob", "2004-12-12")
			.header("Authorization", "Bearer 9tms9x_ejVmAxTrC9GxY1vjfg_vW2SiJh9NM")
		.when()
			.get("/public-api/users")
		.then().log().all()
			.assertThat();
			
			

	}
}
