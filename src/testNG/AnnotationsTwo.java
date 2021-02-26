package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationsTwo {
	@Test
	public void f() {
		System.out.println("@Test f");
	}

	@Test
	public void u() {
		System.out.println("@Test u");
	}

	@Test
	public void r() {
		System.out.println("@Test r ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
	}

}
