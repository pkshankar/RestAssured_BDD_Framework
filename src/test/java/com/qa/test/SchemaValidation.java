package com.qa.test;

import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class SchemaValidation {
	
	// /public-api/users?access-token=9tms9x_ejVmAxTrC9GxY1vjfg_vW2SiJh9NM"
	
	@Test
	public void validateSchema() {
		
		RestAssured.baseURI = "https://gorest.co.in";
		given()
			.queryParam("access-token", "9tms9x_ejVmAxTrC9GxY1vjfg_vW2SiJh9NM")
		.when()
			.get("/public-api/users")
		.then()
			.assertThat()
			.body(matchesJsonSchemaInClasspath("schemaValidation.json"));
		
			
	}
}
