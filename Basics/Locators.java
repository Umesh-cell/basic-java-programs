package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {

		// EdgeDriver driver = new EdgeDriver();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");

		driver.manage().window().maximize(); // To maximize Window

		// name attribute

		driver.findElement(By.name("search")).sendKeys("I Phone");

		// Id attributes

		boolean displaylogo = driver.findElement(By.id("logo")).isDisplayed();

		System.out.println(displaylogo);

		// Linktext and partical linktext

		driver.findElement(By.linkText("Tablets")).click();

		//Finding total number of header links using class name

		List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));

		System.out.println("Total number of headerlink ="+headerlinks.size());
		
		//Total number links using tagname
		
		List<WebElement>linktag =driver.findElements(By.tagName("a"));
		System.out.println("Total number of links ="+linktag.size());

		//Total number of images using tagname
		
	List<WebElement>Images =driver.findElements(By.tagName("img"));
	System.out.println("Total images = "+Images.size());
		
	}

}
