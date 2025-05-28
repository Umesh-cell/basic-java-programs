package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRclick {

	public static void main(String[] args) {



		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demos.devexpress.com/aspxgridviewdemos/customization/ContextMenu.aspx");
		
		driver.manage().window().maximize();
		
		WebElement category = driver.findElement(By.xpath("//td[normalize-space()='Category Name']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(category).click().build().perform(); // Right Click action 
		
		
	}

}
