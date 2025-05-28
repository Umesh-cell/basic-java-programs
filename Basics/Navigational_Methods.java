package Basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Methods {

	public static void main(String[] args) throws MalformedURLException {

		ChromeDriver driver = new ChromeDriver();

		// driver.get("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");
		// // accept only URL as string format only

		// driver.navigate().to("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");
		// // Navigate coomant similar to get url method

		// The diffrence is navigate method accepts URL as string and URL as object

		/*
		 * URL myurl = new
		 * URL("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");
		 * 
		 * driver.navigate().to(myurl);
		 */

		driver.navigate().to("https://www.flipkart.com/travel/flights?otracker=nmenu_Flights");

		driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");

		driver.navigate().back();

		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();

		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh(); //roloading the current page

	}

}
