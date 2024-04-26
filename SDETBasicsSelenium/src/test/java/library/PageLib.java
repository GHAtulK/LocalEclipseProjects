package library;

import org.openqa.selenium.WebDriver;

import pages.GoogleHomePage;

public class PageLib {
	private WebDriver driver;
	private GoogleHomePage gglHomePage;

	public PageLib(WebDriver driver) {
		this.driver = driver;
		gglHomePage = new GoogleHomePage(this.driver);
	}

	public GoogleHomePage getGglHomePage() {
		return gglHomePage;
	}

}
