package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptexecutorDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		
		JavascriptExecutor js = driver;
		
		js.executeScript("arguments[0].setAttribute('value','umesh')",Name); // Without using sendkeys 
		
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='male']"));
		
		js.executeScript("arguments[0].click()",radiobtn); // clicking element
		
		
		

	}
}
