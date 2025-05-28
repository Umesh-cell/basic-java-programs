package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParallelTesting {

	WebDriver driver;

	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {

		switch (br) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser");
			return;

		}

		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test
	void logo() {

		Boolean icon = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();

		Assert.assertEquals(icon, true);

	}

	@Test
	void title() {

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

	}

	@Test
	void url() {

		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterClass
	void close() {
		driver.quit();;

	}

}