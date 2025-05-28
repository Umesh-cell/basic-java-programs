package Testng;

import org.testng.annotations.Test;

public class GroupingThree {

	@Test(priority = 1,groups={"sanity","regression","functional"})
	void myntra() {

		System.out.println("Open Myntra");

	}

	@Test(priority = 2,groups={"sanity","regression","functional"})
	void addtocart() {

		System.out.println("Items carted");

	}

}
