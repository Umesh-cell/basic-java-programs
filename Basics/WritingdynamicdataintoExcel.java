package Basics;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingdynamicdataintoExcel {

	public static void main(String[] args) throws IOException {


		FileOutputStream file = new FileOutputStream("C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\TestData\\dynailcdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		
		int noofrows = sc.nextInt();
		

		System.out.println("Enter number of cells");
		
		int noofcells = sc.nextInt();
		
		for(int r=0; r<=noofrows; r++)
		{
			
			XSSFRow currentrow = sheet.createRow(r);	
			
			for (int c=0; c<noofcells; c++)
			{
				
			  XSSFCell currentcell = currentrow.createCell(c);
			  
			  currentcell.setCellValue(sc.next());
				
			}
			
		}
		
		workbook.write(file);
		
		workbook.close();
		
		file.close();
		
		System.out.println("File is created..");
	}

}
