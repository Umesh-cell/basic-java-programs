package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframes {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.manage().window().maximize();
		
		
		// Locating Frame 1
		
		
	WebElement 	Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); // Taking xpath of the frame
	
	driver.switchTo().frame(Frame1);// Switch to frame one
	
    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
    
    //Switch to frame 2
    
    driver.switchTo().defaultContent(); // go to main page
    
    WebElement Frame2 =  driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
    
    driver.switchTo().frame(Frame2);
     
    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hello");
	
    
    //Switch to frame 3
    
    driver.switchTo().defaultContent();
    
    WebElement Frame3 =  driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
    
    driver.switchTo().frame(Frame3);

    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Good morning");


    // Locating iframe of Frame3
    
    driver.switchTo().frame(0);
    
    driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
	
	}

}
