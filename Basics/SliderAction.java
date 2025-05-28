package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");

		driver.manage().window().maximize();

		WebElement startpointer = driver.findElement(By.xpath("//div[@name='rangeInput']//span[1]"));

		System.out.println("Current location of slider is:" + startpointer.getLocation()); // it is printed in (x,y)

		Actions act = new Actions(driver);

		act.dragAndDropBy(startpointer, 100, 249).perform();

		System.out.println("Current location of slider is:" + startpointer.getLocation());

		WebElement Endslider = driver.findElement(By.xpath("//div[@name='rangeInput']//span[2]"));
		
		System.out.println("Current location of slider is:" + Endslider.getLocation());
		
		act.dragAndDropBy(Endslider, -50, 233).perform();
		
		System.out.println("Current location of slider is:" + Endslider.getLocation());


	}

}
