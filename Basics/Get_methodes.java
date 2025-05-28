package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_methodes {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// get URL

		driver.get("https://www.flipkart.com/account/login?ret=/");

		// get Title of the page

		driver.getTitle();

		System.out.println(driver.getTitle());

		// get current URL

		driver.getCurrentUrl();

		System.out.println(driver.getCurrentUrl());

		// get pageSource

		driver.getPageSource();

		System.out.println(driver.getPageSource());
		
		// get single window handling
		
		/*
		 * String WindowID = driver.getWindowHandle();
		 * 
		 * System.out.println("WindoID:"+WindowID );
		 */
		
		//get Multiple window handling
		
		driver.findElement(By.xpath("//a[normalize-space()='Terms of Use']")).click();
		
		Set <String> WindowIDS = driver.getWindowHandles();
		
		System.out.println(driver.getWindowHandles());
		
		
		// Browser methodes
		
		// close() , Close a single browser window
		
		//driver.close();
		
		driver.quit();
		

	}

}
