package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\chromedriver.exe"); //Selenium 4.6 onwards this is optional as selenium manager feature will take care of the driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //For maximizing the screen
		driver.get("https://www.google.com"); //This waits for all elements to be fully loaded
		driver.navigate().to("https://www.rahulshettyacademy.com"); //This is another way to open another url but it doesn't wait for all elements to be loaded
		driver.navigate().back(); //This will take us back to google.com
		driver.navigate().forward(); //This will navigate forward to rahulshettyacademy.com
		//driver.quit();

	}

}
