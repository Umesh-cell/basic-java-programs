package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();

		driver.get("https://books-pwakit.appspot.com/");

		driver.manage().window().maximize();
		
		// handle shadow element
		
		Thread.sleep(3000);
		
		SearchContext shadow = driver.findElement(By.cssSelector("input[aria-label='Search Books']")).getShadowRoot();
		
		driver.findElement(By.cssSelector("#input")).sendKeys("Welcome");
		
		
		
		
		
		
	}

}
