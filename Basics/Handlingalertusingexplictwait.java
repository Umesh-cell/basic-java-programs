package Basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingalertusingexplictwait {
	
	public static void main(String[] args) throws InterruptedException {

    ChromeDriver driver = new ChromeDriver();
    
    WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
    
    driver.get("https://demo.automationtesting.in/Alerts.html");
    
    driver.manage().window().maximize();
		
    
    // without switchTo()
    
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	
	Thread.sleep(3000);
	
	Alert myalert = mywait.until(ExpectedConditions.alertIsPresent()); // Capture Alert
	
	System.out.println(myalert.getText());
	
	myalert.accept();
	
	
	}

}
