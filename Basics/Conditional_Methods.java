package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		//IsDisplayed - check a element is dsiplayed or not
		
		Boolean display = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		System.out.println(display);
		
		//isEnabled - Check an action enable or not , Like checking input fields , radio btns allowing passing data 
		
		Boolean Enable = driver.findElement(By.xpath("//input[@name='FirstName']")).isEnabled();
		
		System.out.println(Enable);
		
		//isDisplayed - used to check a element is select or not , eg Radio btns , checkboxes
		
		WebElement SelectMale = driver.findElement(By.xpath("//input[@value='M']"));
		
		System.out.println(SelectMale.isSelected());
		
		WebElement SelectFemale = driver.findElement(By.xpath("//input[@value='F']"));
		
		System.out.println(SelectFemale.isSelected());

		// After Selcting male radio btn
        
		System.out.println("After Clicking male radio btn");
		
		SelectMale.click();
		
		
	}

}
