package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait_Demo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Implicit wait
	    
	    driver.get("https://www.orangehrm.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//input[@placeholder='Enter your email address here']")).sendKeys("umesh");
		
	}

}
