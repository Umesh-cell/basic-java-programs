package Basics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// Fluent declaration

		Wait<WebDriver> Mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);

		driver.get("https://www.orangehrm.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@placeholder='Enter your email address here']")).sendKeys("umesh");

		driver.close();
	}

}
