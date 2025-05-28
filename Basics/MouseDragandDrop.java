package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");

		driver.manage().window().maximize();
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions act = new Actions(driver);
		
		Action myactions = act.dragAndDrop(madrid, spain).build();
		
		myactions.perform();
		
		

	}

}
