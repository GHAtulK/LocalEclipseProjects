package actions;

import org.openqa.selenium.WebDriver;

import steps.CommonSteps;

public class CommonActions {

	private WebDriver driver;
	CommonSteps commonSteps;

	public CommonActions(CommonSteps commonSteps) {
		this.driver = commonSteps.getDriver();
	}

	public void goToUrl(String url) {
		driver.get(url);
	}

	public void maximizePage() {
		driver.manage().window().maximize();
	}

	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentTitle() {
		return driver.getTitle();
	}

	public void quitWebDriver() {
		driver.quit();
	}
}
