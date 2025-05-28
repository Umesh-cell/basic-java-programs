package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='filesToUpload']")).sendKeys("C:\\Users\\UMESH\\Downloads\\dummy.pdf");
	
		
	}

}
