package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbarusingscript {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = driver;

		// Scroll down page by pixel number

		/*
		 * js.executeScript("window.scrollBy(0,1500)", "");
		 * 
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 */

		// Sroll the page till element is visible

		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("//*[name()='circle' and contains(@cx,'15')]"));
		 * 
		 * js.executeScript("arguments[0].scrollIntoView();", element);
		 * 
		 * System.out.println(js.executeScript("return window.pageYOffset;"));
		 */

		// Scroll down till end of the page

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		// Scrolling upto intial position 
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		

	}

}
