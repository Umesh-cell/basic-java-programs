package Basics;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriverexcelwriting {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet(); // created sheet

		XSSFRow row1 = sheet.createRow(0);

		row1.createCell(0).setCellValue("Web Automation"); // cell cerated in first row

		row1.createCell(1).setCellValue("Selenium");

		XSSFRow row2 = sheet.createRow(1);

		row2.createCell(0).setCellValue("Mobile Automation");// cell created in second row

		row2.createCell(1).setCellValue("Appium");

		FileOutputStream file = new FileOutputStream(
				"C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\TestData\\write.xlsx");

		workbook.write(file);

		workbook.close();

		file.close();
		
		

	}

}
