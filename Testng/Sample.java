package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	WebDriver driver;

	@Test(priority = 1)
	void openpage() {

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();

		System.out.println("Open page");

	}

	@Test(priority = 2)
	void loginDetails() throws InterruptedException {

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@fdprocessedid='prvqs']")).sendKeys("7560997988");

		System.out.println("Enter Mobile Number");

	}

	@Test(priority = 3)
	void login() {

		driver.findElement(By.xpath("//form[@autocomplete='on']//div//button")).click();

		System.out.println("Login");
	}

}
