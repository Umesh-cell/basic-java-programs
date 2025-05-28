package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetest {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("student");

		driver.findElement(By.id("password")).sendKeys("Password123");

		driver.findElement(By.cssSelector("button.btn")).click();

		// Check contains URL

		String CurrentURl = driver.getCurrentUrl();

		if (CurrentURl.contains("https://practicetestautomation.com/logged-in-successfully/"))

		{

			System.out.println("Fetching new URL Successfully");

		}

		else

		{

			System.out.println("Not found URL!");
		}
		// Checking contains the text

		String pagesource = driver.getPageSource();

		if (pagesource.contains("Congratulations"))

		{
			System.out.println("Passed");

		}

		else

		{

			System.out.println("Failed");

		}

		// check button is present or not

		WebElement Logoutbtn = driver.findElement(By.className("wp-block-button__link"));

		if (Logoutbtn.isDisplayed())

		{

			System.out.println("Log out btn is displayed");

		}

		else {

			System.out.println("Log out btn is not displayed");

		}

		driver.findElement(By.className("wp-block-button__link")).click();

		driver.findElement(By.name("username")).sendKeys("incorrectUser");

		{
			System.out.println("Incorrect user found !!!");
		}

		driver.findElement(By.id("password")).sendKeys("Password123");

		{
			System.out.println("Password not found !!!");

		}
		driver.findElement(By.cssSelector("button.btn")).click();

		boolean Errormsg = driver.findElement(By.cssSelector("div.show")).isDisplayed();
		
		System.out.println(Errormsg);
		
		
		

		
		
	}

}
