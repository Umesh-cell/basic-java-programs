package Basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = driver;
		
		js.executeScript("document.body.style.zoom='40%'");
		
		
	}

}
