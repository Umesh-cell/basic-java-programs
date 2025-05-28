package Basics;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practicetest2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Umesh V U");

		driver.findElement(By.id("email")).sendKeys("umeshkrishna200a@gmail");

		driver.findElement(By.cssSelector("input[placeholder=\"Enter Phone\"]")).sendKeys("7560997986");

		driver.findElement(By.id("textarea")).sendKeys("Invigo Pvt Ltd");

		// Radio Buttons

		WebElement Radiobtn = driver.findElement(By.id("male"));

		Radiobtn.click();

		// Check Boxes

		List<WebElement> Checkboxes = driver.findElements(By.id("monday"));

		for (WebElement Checkbox : Checkboxes) {

			if (!Checkbox.isSelected()) {

				Checkbox.click();

			}

		}

		List<WebElement> Checkboxes2 = driver.findElements(By.id("thursday"));

		for (WebElement Checkbox : Checkboxes2) {

			if (!Checkbox.isSelected()) {

				Checkbox.click();

			}

		}

		// Dropdown

		WebElement Dropdown = driver.findElement(By.id("country"));

		Dropdown.click();

		Select select = new Select(Dropdown);

		// select.deselectByVisibleText("value='china'");

		select.selectByIndex(2); // Selects the 3rd option (index starts from 0)

		WebElement selectdropdown = select.getFirstSelectedOption();

		System.out.println("Selected Value: " + selectdropdown.getText());

		// Date picker

		WebElement Datepicker = driver.findElement(By.id("datepicker"));

		Datepicker.clear();

		Datepicker.sendKeys("01/22/2025");

		Datepicker.sendKeys(Keys.RETURN);

		WebElement Datepicker2 = driver.findElement(By.id("txtDate"));

		// Datepicker2.clear();

		Datepicker2.sendKeys("25/01/2025");

		Datepicker2.sendKeys(Keys.RETURN);

		// File upload

		/*
		 * WebElement Fileupload = driver.findElement(By.id("singleFileInput"));
		 * 
		 * Fileupload.click();
		 * 
		 * Fileupload.sendKeys("C:\\Users\\UMESH\\OneDrive\\Documents\\Address.txt");
		 */

		// Search Engine

		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Java");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// Button Click

		driver.findElement(By.name("start")).click();

		driver.findElement(By.name("stop")).click();

		// Alert Box - Simple Alert

		driver.findElement(By.id("alertBtn")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println("Alert Message");

		alert.accept();

		// Confirmation Alert       

		WebElement alert2 = driver.findElement(By.id("confirmBtn"));

		alert2.click();

		Alert alert21 = driver.switchTo().alert();

		System.out.println("Alert Message: " + alert21.getText());

		alert21.accept();

		// Prompt Alert

		Thread.sleep(5000);
		
		driver.findElement(By.id("promptBtn")).click();

		Alert alert22 = driver.switchTo().alert();

		System.out.println("Alert Message: " + alert22.getText());

		alert22.sendKeys("Hello It's me Umesh");

		alert22.accept();

		// Drag and Drop

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);

		actions.dragAndDrop(source, target).build().perform();

		
		// Mousehover 
		
		/*
		 * Thread.sleep(3000);
		 * 
		 * WebElement hoverElement =
		 * driver.findElement(By.xpath("//button[@fdprocessedid=\"5bz59\"]"));
		 * 
		 * Actions actions1 = new Actions(driver);
		 * 
		 * actions1.moveToElement(hoverElement).perform();
		 * 
		 * WebElement Submenu =
		 * driver.findElement(By.xpath("//aside//div//div//div//div//div[1]//a[1]"));
		 * 
		 * actions1.moveToElement(Submenu).click().perform();
		 */
	}

}
