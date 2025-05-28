package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_demo {

	public static void main(String[] args) {



	    ChromeDriver driver = new ChromeDriver();
	    
	    WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5)); //
	    
	    driver.get("https://www.orangehrm.com/");
	    
	    driver.manage().window().maximize();
	    
	   // driver.findElement(By.xpath("//input[@placeholder='Enter your email address here']")).sendKeys("umesh");
	    
	    WebElement Email = mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@placeholder='Enter your email address here']\"") ));
	
	  

}
}