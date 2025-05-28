package Basics;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRandomDataInsert {

	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream(
				"C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\TestData\\RandomInsert.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet();

		XSSFRow row = sheet.createRow(3);

		XSSFCell cell = row.createCell(2);

		cell.setCellValue("Umesh");

		workbook.write(file);

		workbook.close();
		
		file.close();
		
		System.out.println("File is Created...");

	}

}
