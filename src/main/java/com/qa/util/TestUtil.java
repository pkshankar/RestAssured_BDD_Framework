package com.qa.util;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtil {

	public static Object[][] getDataExcelCustomer(String sheetName) {

		Object[][] objectArr = null;

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\pkshank\\eclipse-workspace\\RestAssured_BDD_Framework\\src\\main\\java\\com\\qa\\data\\Formula1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int lastRowNum = sh.getLastRowNum();
			int lastCellNum = sh.getRow(0).getLastCellNum();
			objectArr = new Object[lastRowNum][lastCellNum];
			for (int rw = 0; rw < lastRowNum; rw++) {

				for (int cl = 0; cl < lastCellNum; cl++) {

					objectArr[rw][cl] = (int) sh.getRow(rw).getCell(cl).getNumericCellValue();

				}

			}
			return objectArr;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return objectArr;

	}

}
