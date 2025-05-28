package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void test() {

		String Expected = "OpenCart";

		String Actual = "Openshot";

		if (Expected.equals(Actual)) {

			System.out.println("Passed");

	 		Assert.assertTrue(true);

		} else

		{

			System.out.println("Failed");

			Assert.assertTrue(false);

		}

	}
}