package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsPart3WithString {

	public static void main(String[] args) throws Exception {
		
		String name="rahul";
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name); 
		driver.findElement(By.name("inputPassword")).sendKeys(password); 
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); 
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); //xpath with text
		driver.quit();
		
		

	}
	
	//Extracting password dynamically from error popup using method
	public static String getPassword(WebDriver driver) throws Exception
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Output = Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'"); //Splitting the text on the basis of single quote
		/*This will create an array with
		 * 0th index - Please use temporary password
		 * 1st index - rahulshettyacademy' to Login.*/
		
		String[] passwordArray2 = passwordArray[1].split("'"); //Again splitting the 1st index of the array on the basis of single quote
		/*This will again create an array with
		 * 0th index - rahulshettyacademy
		 * 1st index - ' to Login.*/
		String password = passwordArray2[0];
		return password;		
	}
}
