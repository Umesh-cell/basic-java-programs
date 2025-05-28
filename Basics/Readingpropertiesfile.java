package Basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Readingpropertiesfile {

	public static void main(String[] args) throws IOException {

		
		FileInputStream file = new FileInputStream("C:\\Users\\UMESH\\OneDrive\\Desktop\\Selenium\\AutomationusingMaven\\TestData\\Propertiesfile");

		// loading property file
		
		Properties propobj = new Properties();
		
		propobj.load(file);
		
		// reading data from properties file
		
		String URL = propobj.getProperty("Url");
		
		String USERNAME = propobj.getProperty("Username");
		
		String PASSWORD = propobj.getProperty("Password");
		
		System.out.println(URL+ " "+USERNAME+" "+PASSWORD +"\t");
		
		
		
		//Reading keys from the property file
		
		Set<String> keys = propobj.stringPropertyNames();
		
		System.out.println(keys);
		
		
	}
 
}
