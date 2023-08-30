package org.automate.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name = "DYNAMIC")
	public static Object[][] getTestData() throws IOException

	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\TestData\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Login");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] result = new Object[physicalNumberOfRows - 1][numberOfCells];

		for (int i = 1; i < physicalNumberOfRows; i++)

		{
			Row row = sheet.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING))

				{
					String stringCellValue = cell.getStringCellValue();
					result[i - 1][j] = stringCellValue;

				}

				else if (cellType.equals(CellType.NUMERIC))

				{
					double numericCellValue = cell.getNumericCellValue();

					int val = (int) numericCellValue;

					String valueOf = String.valueOf(val);

					result[i - 1][j] = valueOf;

				}

			}
		}

		return result;
	}

	@DataProvider(name = "STATIC_DATA")
	public static String[][] getTestData2() throws IOException

	{
		String[][] result = { { "Promantus", "Promantus12" } };
		return result;
	}

	@DataProvider(name = "DYNAMIC_USERDATA")
	public static Object[][] getUserData() throws IOException

	{
		File file = new File("D:\\Eclipse_Workspace\\SeleniumTestNG\\TestData\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("User");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] result = new Object[physicalNumberOfRows - 1][numberOfCells];

		for (int i = 1; i < physicalNumberOfRows; i++)

		{
			Row row = sheet.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING))

				{
					String stringCellValue = cell.getStringCellValue();
					result[i - 1][j] = stringCellValue;

				}

				else if (cellType.equals(CellType.NUMERIC))

				{
					double numericCellValue = cell.getNumericCellValue();

					int val = (int) numericCellValue;

					String valueOf = String.valueOf(val);

					result[i - 1][j] = valueOf;

				}

			}
		}

		return result;
	}

}
