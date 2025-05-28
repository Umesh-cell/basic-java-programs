package Testng;

import org.testng.annotations.Test;

public class Firstpgm {
	
@Test(priority=0)
	void openpage() {

		System.out.println("Open page");

	}
@Test(priority=1)
	void login() {

		System.out.println("Login");

	}
@Test(priority=-1)
	void logout() {

		System.out.println("Logout");

	}
}
