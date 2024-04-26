package pagefactorywebelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageElements {

	WebDriver driver;

	@FindBy(xpath = "//textarea[@class=\"gLFyf\"]")
	public WebElement textBox;

	public GoogleHomePageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
