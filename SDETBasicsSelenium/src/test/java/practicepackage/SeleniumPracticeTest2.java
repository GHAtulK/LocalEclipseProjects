package practicepackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;

public class SeleniumPracticeTest2 extends BaseClassTest {

	GoogleHomePage gglHomePage;

	@Test
	public void testChromeDriver() throws Exception {
		app().getPage();
		String expectedTitle = "testng - Google Search";
		System.out.println("Browser Opened");
		gglHomePage.enterTextMethod();
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

}