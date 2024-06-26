package practicepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import library.AppLib;

public class BaseClassTest {

	WebDriver driver;
	private AppLib app;

	@BeforeMethod(alwaysRun = true)
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		app = new AppLib(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	public AppLib app() {
		return app;
	}
}
