package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods(close, get etc)
		//Firefox - FirefoxDriver ->Methods(close, get etc)
		//Safari - SafariDriver ->Methods(close, get etc)
		//Edge - MicrosoftEdgeDriver ->Methods(close, get etc)
		//WebDriver ->Methods(empty body with close, get etc)
		
		//Chrome
		//chromedriver.exe is required to launch Chrome Browser
		//webdriver.chrome.driver->set the value of path of chromedriver
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close(); - This only closes the main window and doesn't close any other windows which got opened during automation
		driver.quit(); //This closes all windows opened via automation
		
		//Firefox
		//geckodriver.exe is required to launch Firefox Browser
		System.setProperty("webdriver.gecko.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://rahulshettyacademy.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		//driver1.close(); - This only closes the main window and doesn't close any other windows which got opened during automation
		driver1.quit(); //This closes all windows opened via automation
		
		//Microsoft Edge
		//msedgedriver.exe is required to launch Microsoft Edge Browser
		System.setProperty("webdriver.edge.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://rahulshettyacademy.com");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		System.out.println(driver2.getPageSource()); //get entire page source
		//driver2.close(); - This only closes the main window and doesn't close any other windows which got opened during automation
		driver2.quit(); //This closes all windows opened via automation
				
		
	}

}
