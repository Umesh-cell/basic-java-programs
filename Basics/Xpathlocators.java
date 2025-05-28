package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocators {

	public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    
    driver.get(("https://www.flipkart.com/account/login?ret=/"));
    
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("umeshkrishna2001@gmail.com");
    
    driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
    
    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("7560997988");

    
  
    
    
		
		
	}

}
