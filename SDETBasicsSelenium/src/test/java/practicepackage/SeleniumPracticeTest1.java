package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SeleniumPracticeTest1 {

	WebDriver driver;

	@BeforeClass
	public void beforeClassSetup() {
		System.out.println("Before Class settings done...");
		System.out.println("Execution Starts.....");
	}

	@AfterClass
	public void afterClassSetup() {
		System.out.println("After Class settings done...");
		System.out.println("Execution Ends.....");
	}

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void testChromeDriver() throws Exception {

		String expectedTitle = "testng - Google Search";
		System.out.println("Browser Opened");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("TestNG");
		Thread.sleep(2000);
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@class=\"M6CB1c rr4y5c\"]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class=\"A8SBwf emcav\"]")).click();
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();
		String currentTitle = driver.getTitle();
		System.out.println("The current URL is " + "\"" + currentURL + "\"");
		System.out.println("The current title is " + "\"" + currentTitle + "\"");
		// Below are hard assertions
		Assert.assertEquals(currentTitle, expectedTitle, "Verify the title of the new page");
		// Assert.assertNotEquals(actual1, actual2, "Description");
		// Assert.assertTrue(condition, "Description");
		// Assert.assertFalse(condition, "Description");
		// Assert.assertNull(object, message);
		// Assert.assertNotNull(object, message);
		System.out.println("Browser Closed");
	}

	@Test
	public void softAsertsExample() throws Exception {
		SoftAssert sa = new SoftAssert();
		// SoftAssert executes all the lines in the method even after failure
		String expectedTitle = "testng - Google Search";
		System.out.println("Browser Opened");
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("TestNG");
		Thread.sleep(2000);
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@class=\"M6CB1c rr4y5c\"]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class=\"A8SBwf emcav\"]")).click();
		Thread.sleep(2000);
		String currentURL = driver.getCurrentUrl();
		String currentTitle = driver.getTitle();
		System.out.println("The current URL is " + "\"" + currentURL + "\"");
		System.out.println("The current title is " + "\"" + currentTitle + "\"");
		// Below are hard assertions
		sa.assertEquals(currentTitle, expectedTitle, "Verify the title of the new page");
		// Assert.assertNotEquals(actual1, actual2, "Description");
		// Assert.assertTrue(condition, "Description");
		// Assert.assertFalse(condition, "Description");
		// Assert.assertNull(object, message);
		// Assert.assertNotNull(object, message);
		System.out.println("Browser Closed");
		sa.assertAll();
	}
}
