package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) throws InterruptedException{

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@fdprocessedid='cgcfj']")).sendKeys("7560997988");
		
		driver.findElement(By.xpath("//form[@autocomplete='on']//div//button")).click();

	}

}
