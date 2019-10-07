package com.qa.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetFormulaOneInfo {

	@Test
	public void formulaOneInfoTest() {

		given().
			
		when().
			get("http://ergast.com/api/f1/2010/circuits.json").
		then().
			assertThat().
			statusCode(200).
			and().
			contentType("application/json").
			and().
			header("Content-Length", equalTo("4350")).
			and().
			body("MRData.CircuitTable.Circuits.circuitName", hasSize(19));

	}
}