package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElements {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		// Checkbox handling

		// Specific checkbox

		//driver.findElement(By.xpath("//input[@value='sunday']")).click();

		// Selecting all checkboxes

		
		   List<WebElement> Checkboxes = driver.findElements(By.xpath( "//input[@class=\"form-check-input\"and@type=\"checkbox\"]"));
		  
		 /* for (int i = 0; i <= Checkboxes.size(); i++)
		 * 
		 * {
		 * 
		 * Checkboxes.get(i).click(); 
		 * 
		 * }
		 */
		   
		//OR
		
		/*
		 * for ( WebElement checkbox:Checkboxes ) {
		 * 
		 * checkbox.click();
		 * 
		 * 
		 * }
		 */
			
		//Select last three checkboxes
		
		// Total number of checkboxes(7) - number of checkboxes selcted(3) = Starting index[4] 
		
		/*
		 * for (int i=4; i<Checkboxes.size();i++) {
		 * 
		 * Checkboxes.get(i).click(); }
		 * 
		 * // Selecting first three checkboxes
		 * 
		 * 
		 * for(int i=0; i<=2; i++) { Checkboxes.get(i).click();
		 * 
		 * }
		 */
	     // Unselect checkboxes if they are selected
	     
		   for(int i=0; i<=2; i++) 
		   
		   { 
			   Checkboxes.get(i).click();
			
		   }
		   
		   
		   Thread.sleep(5000);
		   
		   for(int i=0; i<=Checkboxes.size(); i++) 
			   
		   { 
			   if(Checkboxes.get(i).isSelected()) {
				   
				   Checkboxes.get(i).click();

				   
			   }
			
		   }
		 
		    
		   
	     
	}

}
