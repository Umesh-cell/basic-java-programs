package Basics;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.opencart.com/admin/index.php");
	
	driver.manage().window().maximize();
	
	WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	Username.clear();
	
	Username.sendKeys("demo");
	
	WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
	Password.clear();
	
	Password.sendKeys("demo");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//body/div/nav/ul/li[6]/a[1]")).click();
	
	driver.findElement(By.xpath("//body//div//nav//ul//li//ul//li//a[contains(text(),'Customers')]")).click();
	
	// Capture Number of pages 
	
	String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
	
	int totalpages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	
	
	// Clicking pages 
	
	for(int P=1;P<=5;P++)
	{
		if(P>1)
			
		{
			
			WebElement activepages = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+P+"]"));
			
			activepages.click();
			
		}
		
		
	}
	
	
	
	}

}
