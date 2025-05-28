package Basics;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotsDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		// Full page Screenshot

		/*
		 * TakesScreenshot screen = driver;
		 * 
		 * File Sourcefile = screen.getScreenshotAs(OutputType.FILE); // It is stored in
		 * somewhere of memory location
		 * 
		 * File targetfile = new File(
		 * "C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\Screenshots\\myntra.png"
		 * ); // Located // our // own // folder
		 * 
		 * Sourcefile.renameTo(targetfile); // Changed source to target
		 */
		// capture Specific area from tha page
		
		WebElement Shoes = driver.findElement(By.cssSelector(
				"img[alt='Image'][src='https://rukminim2.flixcart.com/fk-p-flap/520/280/image/d734ed32ac49cf20.jpg?q=20']"));

		File source = Shoes.getScreenshotAs(OutputType.FILE);

		File target = new File(
				"C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\Screenshots\\shoes.png");

		source.renameTo(target);
		
		
		

	}

}
