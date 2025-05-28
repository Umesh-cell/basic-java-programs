package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		// Thread.sleep(3000);

		driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("Admin");

		driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();


		
		

}
}