package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowserwindows {

	public static void main(String[] args) {


		 
		
		driver.findElement(By.xpath("//a[normalize-space()='Terms of Use']")).click();
		
		Set <String> windowid = driver.getWindowHandles();
		
		List <String> windowlist = new ArrayList(windowid);
		
		String ParentID = windowlist.get(0);
		
		String childID = windowlist.get(1);
		
		// Switch to Child window
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.getTitle());
		
		// Switch to Parent  window
		
		/*
		 * driver.switchTo().window(ParentID);
		 * 
		 * driver.getTitle();
		 */
	}

}
