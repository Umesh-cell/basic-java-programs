package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class EnableextensionsonRuntime {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();	
		

		
		
	}

}
