package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugdropdown {

	public static void main(String[] args) {

   ChromeDriver driver = new ChromeDriver();
   
   driver.get("https://demo.automationtesting.in/AutoComplete.html");
   
   driver.manage().window().maximize();
   
   driver.findElement(By.xpath("//body/section/div/div[2]/div[1]/div[1]")).sendKeys("i");
   
		
		
	}

}
