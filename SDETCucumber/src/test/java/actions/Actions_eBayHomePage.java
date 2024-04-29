package actions;

import org.openqa.selenium.WebDriver;

import elements.Elements_eBayHomePage;
import steps.CommonSteps;

public class Actions_eBayHomePage {

	private WebDriver driver;
	Elements_eBayHomePage elementsEbayHomePage;

	public Actions_eBayHomePage(CommonSteps commonsteps) {
		this.driver = commonsteps.getDriver();
		elementsEbayHomePage = new Elements_eBayHomePage(driver);
	}

	public void clickAdvancedLink() {
		elementsEbayHomePage.advancedLink.click();
	}
}
