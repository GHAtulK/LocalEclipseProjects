package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\EclipseWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait timeout of 5 seconds across the program
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul"); //id locator
		driver.findElement(By.name("inputPassword")).sendKeys("hello123"); //name locator
		driver.findElement(By.className("signInBtn")).click(); //className locator

		/*Css Selector
		=======================
		1) id -> tagname#id value
		For example <input type="text" id="inputUsername"> then Css will be #inputUsername
		
		2) class name -> tagname.classnameValue
		For example <button type="text" class="signInBtn"> then Css will be button.signInBtn
		
		3) If neither classname nor id locator is present, then we can use tagname[arribute='value']
		For example <input type="text"> then Css will be input[type='text']
		=======================*/
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //We can also use only .error if it's unique on the page
		
		/*SelectorsHub or ChroPath plugins will easily let us know if there are multiple locators with same attributes or not
		Also, if the plugins are not allowed then go to Console and in search section, type
		$('p.error') for the above element, it will show how many instances are there with same values*/
		
		//Link Text-> Whenever an html tag creates with a tag, it's an anchor which represents a link
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		/*Xpath-> 
		//tagname[@attribute='value'] ---> //input[@placeholder='username']
		To check from console, we need to type $x('//input[@placeholder="Name"]') then it will validate
		*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Atul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("atul@abc.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear(); //For clearing the text //index with xpath
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("atul@xyz.com"); //index with Css
		driver.findElement(By.xpath("(//form/input)[3]")).sendKeys("1234567890"); //Xpath using parent/child tagnames only
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //Css with only attribute value

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//Css using parent/child tagnames only
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //hybrid xpath locator
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); //Css with id locator
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //Css with regular expression
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //xpath with regular expression
		
		driver.quit();

	}

}
