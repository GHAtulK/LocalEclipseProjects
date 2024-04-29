package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		Thread.sleep(2000);
	}

	public WebDriver getDriver() {
		return driver;
	}
}

