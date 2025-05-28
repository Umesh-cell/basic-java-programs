package Testng;

import org.testng.annotations.Test;

public class GroupingOne {

	@Test(priority = 1, groups={"sanity"})
	void openpage() {

		System.out.println("Open page");

	}

	@Test(priority = 2,groups={"sanity"})
	void login() {

		System.out.println("Login");

	}

	@Test(priority = 3,groups={"sanity"})
	void logout() {

		System.out.println("Logout");

	}
}
