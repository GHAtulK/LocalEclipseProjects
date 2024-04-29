package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements_eBayHomePage {

	WebDriver driver;

	@FindBy(linkText = "Advanced")
	public WebElement advancedLink;

	public Elements_eBayHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
