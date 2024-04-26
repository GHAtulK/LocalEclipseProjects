package practicepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestClass {

	@BeforeSuite
	public void beforeSuiteSetup() {
		System.out.println("Before Suite Executed");
	}

	@AfterSuite
	public void afterSuiteTearDown() {
		System.out.println("After Suite Executed");
	}

	@BeforeTest
	public void beforeTestSetup() {
		System.out.println("Before Test Setup Done");
	}

	@AfterTest
	public void afterTestTearDown() {
		System.out.println("After Test Teardown Done");
	}

	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("Before Class Executed");
	}

	@AfterClass
	public void afterClassSetup() {
		System.out.println("After Class Executed");
	}

	@BeforeMethod
	public void beforeMethodSetup() {
		System.out.println("Before Method Executed");
	}

	@AfterMethod
	public void afterMethodSetup() {
		System.out.println("After Method Executed");
	}

	@Test
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		System.out.println("Test3");
	}

	@Test
	public void test4() {
		System.out.println("Test4");
	}

	@Test
	public void test5() {
		System.out.println("Test5");
	}
}
