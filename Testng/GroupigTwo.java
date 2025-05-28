package Testng;

import org.testng.annotations.Test;

public class GroupigTwo {

	@Test(priority = 1,groups={"regression"})
	void openflipkart() {

		System.out.println("Open Flipkart");

	}

	@Test(priority = 2,groups={"regression"})
	void loginflipkart() {

		System.out.println("Login Flipkart");

	}

	@Test(priority = 3,groups={"regression"})
	void logoutflipkart() {

		System.out.println("Logout Flipkart");
	}

}