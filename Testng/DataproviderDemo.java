package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {

	ChromeDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(dataProvider="dp")
	void login(String name , String pswd) throws InterruptedException {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
		driver.findElement(By.cssSelector("button.btn")).click();
		boolean Text = driver.findElement(By.xpath("//section[@role='main']//div//div//article//div//h1"))
				.isDisplayed();

		if (Text == true) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();

		}

		else {
			Assert.fail();

		}
	}

	@AfterClass
	void close() {

		driver.close();

	}

	@DataProvider(name="dp", indices = {0,2})
	Object[][] loigndata()

	{

		Object data[][] = { { "student1", "qwert" }, { "student2", "1234" }, { "student", "Password123" },
				{ "student3", "mnbv" }, };
		return data;
		
		
	}

}
