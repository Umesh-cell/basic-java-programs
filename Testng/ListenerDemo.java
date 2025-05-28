package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(Testng.MyListener.class)
public class ListenerDemo {

	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test
	void logo() throws InterruptedException {

		Thread.sleep(3000);
		
		Boolean icon = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();

		Assert.assertEquals(icon, true);

	}

	@Test
	void title() {

		Assert.assertEquals(driver.getTitle(), "OrangeHR");

	}

	@Test(dependsOnMethods= {"title"})
	void url () {

		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterClass
	void close() {
		driver.quit();
		;

	}

}
