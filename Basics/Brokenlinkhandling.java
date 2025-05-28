package Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkhandling {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");

		driver.manage().window().maximize();

		// Collecting all links from the page

		List<WebElement> Links = driver.findElements(By.tagName("a"));

		System.out.println("Total count of links" + Links.size());

		int nobrokenlink = 0;

		for (WebElement hreflink : Links)

		{
			String mainlink = hreflink.getAttribute("href");

			if (mainlink == null || mainlink.isEmpty())

			{

				System.out.println("href is empty");
				continue;

			}

			// hit URL to the server

			try {

				URL linkURL = new URL(mainlink); // Covert Links from Strong format to URL

				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); // Open connection to the server

				conn.connect(); // connect to the server and sent request to server

				if (conn.getResponseCode() >= 400) {

					System.out.println("It's a Broken link");

					nobrokenlink++;

				}

				else

				{
					System.out.println("Not a broken link");

				}
			} catch (Exception e) {

			}

		}
		System.out.println(nobrokenlink); // count of broken link

	}

}
