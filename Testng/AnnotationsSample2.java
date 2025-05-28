package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsSample2 {

	@BeforeClass

	void login() {

		System.out.println("Login");

	}

	@Test(priority = 1)

	void search() {

		System.out.println("Search");

	}

	@Test(priority = 2)
	void advancesearch() {

		System.out.println("Advance search");

	}

	@AfterClass
	void logout() {

		System.out.println("Logout");
	}
}
