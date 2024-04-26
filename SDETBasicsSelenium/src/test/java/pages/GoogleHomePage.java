package pages;

import org.openqa.selenium.WebDriver;

import pagefactorywebelements.GoogleHomePageElements;

public class GoogleHomePage {
	WebDriver driver;
	GoogleHomePageElements gglHomePageElement;

	public GoogleHomePage(WebDriver driver) {
		this.driver = driver;
		gglHomePageElement = new GoogleHomePageElements(driver);
	}

	// Create methods to perform in Test Class
	public void enterTextMethod() {
		gglHomePageElement.textBox.sendKeys("TestNG");
	}
}
