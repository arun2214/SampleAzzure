package SampleTest.SampleTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
@Test
	public static void SeleniumTest() {
		// TODO Auto-generated constructor stub
		
		    System.out.println("Launching google chrome with new profile..");
	        //WebDriverManager.chromedriver().setup();
	       // WebDriver driver = new ChromeDriver();
		    Assertions.assertEquals("a", "a"); 
		    
	        //driver.navigate().to("google.com");
		    //arun

}
}
