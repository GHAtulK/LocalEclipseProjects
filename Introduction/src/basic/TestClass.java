package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("www.gmail.com");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		
		driver.close();
		

	}

}
