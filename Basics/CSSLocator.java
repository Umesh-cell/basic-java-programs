package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag#id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Night Visions");
		
		//tag.Classname
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Night Visions");
		
		//tag attribute
		
		driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Night Visions");
		
		driver.findElement(By.cssSelector("button.search-box-button")).click();
		
		 
		
		
	}

}
