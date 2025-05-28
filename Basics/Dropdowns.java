package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v130.network.model.DataReceived;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

     ChromeDriver driver = new ChromeDriver();
     
     driver.get("https://testautomationpractice.blogspot.com/");
     
     driver.manage().window().maximize();
     
     WebElement  Sdrp = driver.findElement(By.id("country"));
		
     Select Drpdown = new Select(Sdrp);
     
     //Select value from the dropdown
     
    // Drpdown.selectByVisibleText("Germany");
     
    // Drpdown.selectByIndex(9);
     
     Drpdown.selectByValue("uk");
     
     // Taking the options count from the dropdowm
     
      List <WebElement>options = Drpdown.getOptions();
      
      System.out.println("Total number of options :"+options.size());
      
      //Printing all options
      
      for (int i=0; i<options.size(); i++)
    	  
      {
    	  
    	  System.out.println(options.get(i).getText());
      }
     
      //Hidden dropdown
      
       
      
      
		
	}

}
