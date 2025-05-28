package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_commands {

	public static void main(String[] args) throws InterruptedException {

    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.orangehrm.com/");
    
    driver.manage().window().maximize();
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//input[@placeholder='Enter your email address here']")).sendKeys("umesh");
    
    
		
		
		
		
	}

}
