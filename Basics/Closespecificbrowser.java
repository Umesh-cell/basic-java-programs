package Basics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Closespecificbrowser {

	public static void main(String[] args) {


		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/account/login?ret=/");
		
		driver.manage().window().maximize();
		
		Set <String> windowid = driver.getWindowHandles();
		
		for(String winid :windowid )
		{
			
			String title = driver.switchTo().window(winid).getTitle();
			
			if (title.equals("Flipkart") || title.equals("some other titles"))
				
			{
				
				driver.close();
				
				
			}
			
		}
		
	}

}
