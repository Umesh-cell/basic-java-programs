package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		// open the link in New Tab

		WebElement Login = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));

		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(Login).keyUp(Keys.CONTROL).perform();
		
		
		
		
		
	}

}
