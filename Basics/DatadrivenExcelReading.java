package Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenExcelReading {

	public static void main(String[] args) throws IOException {

		// reading data from excel

		FileInputStream file = new FileInputStream(
				"C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\TestData\\Sample data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file); // getting the workbook

		XSSFSheet sheet = workbook.getSheet("Sheet1"); // getting sheet

		int row = sheet.getLastRowNum(); // getting tottal rows

		int cells = sheet.getRow(1).getLastCellNum(); // getting cells

		System.out.println("Total number of rows" + row);

		System.out.println("Total number of cells" + cells);

		for (int r = 0; r <= row; r++) // For counting rows
		{

			XSSFRow currentrow = sheet.getRow(r); // Extract the current row

			for (int c = 0; c < cells; c++)

			{
				XSSFCell currentcell = currentrow.getCell(c); // get the cells in a current row

				System.out.print(currentcell.toString() + "\t");

			}
			
			System.out.println();
		}

		workbook.close();
		file.close();

	}

}
