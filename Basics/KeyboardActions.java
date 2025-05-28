package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		WebElement Searchbar = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));

		Searchbar.sendKeys("Samsung");

		Actions act = new Actions(driver);

		// Ctrl+A

		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// Ctrl+C

		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		// Tab

		Thread.sleep(3000);

		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		Searchbar.clear();

		// Ctrl+V

		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

		// Ctrl+Shift+A

		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		//Enter
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		// Open the link in new tab
		
		

	}

}
