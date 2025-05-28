package Basics;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("");

		driver.manage().window().maximize();
		
		
	}

}
