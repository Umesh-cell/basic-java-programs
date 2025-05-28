package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		// Using sendkeys

		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("02/18/2025");

		driver.findElement(By.xpath("//input[@type='text']")).click();

		// Current Month and Year Fetching

		// Expecting Month , Year , Date

		String Month = "April";

		String Year = "2025";

		String Date = "30";

		while (true) {

			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentmonth.equals(Month) && currentyear.equals(Year)) {

				break;

			}

			else {

				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

			}

			List<WebElement> Alldates = driver
					.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

			for (WebElement dt : Alldates)

			{
				if (dt.getText().equals(Date)) {

					dt.click();

					break;

				}

			}
		}

	}
}
