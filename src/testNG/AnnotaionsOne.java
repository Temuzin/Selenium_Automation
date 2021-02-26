package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotaionsOne {

	@Test // Functional Script
	public void f() {
		System.out.println("@Test f");
	}

	@Test // Functional Script
	public void p() {
		System.out.println("@Test p");
	}

	@Test // Functional Script
	public void a() {
		System.out.println("@Test a");
	}

	@BeforeClass // Pre-condtiona script
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass // Post-condtiona script
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
