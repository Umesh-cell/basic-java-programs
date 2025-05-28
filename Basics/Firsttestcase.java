package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {

	public static void main(String[] args) {

		// Open chrome browser

		// ChromeDriver driver = new ChromeDriver();

		ChromeDriver driver = new ChromeDriver();

		// Open url

		driver.get("https://www.flipkart.com/");

		// Title Validation

		String actualtitle = driver.getTitle();

		if (actualtitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))

		{
			System.out.println("Passed");

		} else

		{

			System.out.println("Failed");

		}
		
		
		// Close browser
		
		driver.close();

	}

}
