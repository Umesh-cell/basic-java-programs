package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		// Static Table

		// Find rows of a table

		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();

		System.out.println("Total Number of Rows=" + rows);

		// Find Columns of a table

		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

		System.out.println("Total Number of Cols=" + cols);

		// Read data from a specific col and row

		String txt = driver.findElement(By.xpath("//table[@name='BookTable']//tr[6]//td[3]")).getText();

		System.out.println(txt);

		/*
		 * // Read all data from rows and cols
		 * 
		 * for (int r = 2; r <= rows; r++) // For loop for Rows
		 * 
		 * { for (int c = 1; c <= cols; c++) // For loop for cols
		 * 
		 * { String texts =
		 * driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td["
		 * + c + "]")) .getText();
		 * 
		 * System.out.print(texts + "\t"); // '/t' for tab space
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

		// Print book name whose author is Amit

		for (int r = 2; r < rows; r++) {

			String autorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]"))
					.getText();

			if (autorname.equals("Amit")) {
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]"))
						.getText();

				System.out.println(bookname);

			}

		}
	}
}
