package AutomationLab.Naveen;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BookStoreTest {
 
	WebDriver driver;
	 @BeforeMethod
	  public void setup() {
		 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
			
		 driver=new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/login");
	  }
	@Test
  public void TitleTest() {
		
		String appTitle=driver.getTitle();
		System.out.println("Application Title is:"+appTitle);
  }
 

  @AfterMethod
  public void TearDown() {
	  
	  driver.quit();
  }

}
