package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://widgettest.qa3.vizru-ras.com/user.signin");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("umesh@vizru.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Umesh@13");
		
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		driver.findElement(By.xpath("//i[@class='icon-user-2 font-lg']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();


	}

}
