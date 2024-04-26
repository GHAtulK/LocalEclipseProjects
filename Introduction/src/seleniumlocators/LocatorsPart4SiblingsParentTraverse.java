package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPart4SiblingsParentTraverse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Sibling to Sibling traverse
		//header/div/button[1]/following-sibling::button[2]
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
		driver.quit();

		//Child to Parent traverse
		//header/div/button[1]/parent::div = parent of button is div
		//header/div/button[1]/parent::div/parent::header = parent of div is header
		
		
		
	}

}
