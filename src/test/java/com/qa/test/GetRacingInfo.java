package com.qa.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.TestUtil;

public class GetRacingInfo {

	@DataProvider
	public Object[][] getTestData() {

		Object[][] obj = TestUtil.getDataExcelCustomer("FormulaOneDetails");
		return obj;
	}

	@Test(dataProvider = "getTestData")
	public void weatherInfoTest(int season, int noOfRaces) {
		given().
				pathParam("raceYear", String.valueOf(season)).
		when()
				.get("http://ergast.com/api/f1/{raceYear}/circuits.json").
		then().
				assertThat()
				.body("MRData.CircuitTable.Circuits.circuitId", hasSize(noOfRaces));

	}

}
