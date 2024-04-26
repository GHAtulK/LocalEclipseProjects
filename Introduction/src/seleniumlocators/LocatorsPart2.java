package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPart2 {

	public static void main(String[] args) throws Exception {
		String name="rahul";
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.className("signInBtn")).click(); 
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText()); //tagName locator which uses only by using tagname, but this is rarely used
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); //Assertion to verify output
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); //xpath with text
		driver.quit();
	
	
	}

}