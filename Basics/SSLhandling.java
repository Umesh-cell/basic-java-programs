package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLhandling {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions(); // Creating object Chromeoptions

		/*
		 * options.setAcceptInsecureCerts(true); // Accept SSL
		 * 
		 * ChromeDriver driver = new ChromeDriver(options);
		 * 
		 * driver.get("https://expired.badssl.com/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * System.out.println(driver.getTitle());
		 */

		// Hide the text from automated browser "Chrome is being controlled by a
		// automated test software"

		options.setExperimentalOption("execludeSwitechs", new String[] {"enable-automation"});

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

	}

}
