package testNG_Serial_Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	@Test
	  public void flipkartTest() 
	  {
		  WebDriver driver = new ChromeDriver();
		 // driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
	  }
}