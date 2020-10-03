package AutomationLab.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.londonfreelance.org/courses/frames/index.html");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			int totalframes= driver.findElements(By.tagName("frame")).size();
			System.out.println("Total Frames on this page:"+totalframes);
			//driver.switchTo().frame(2);
			//driver.switchTo().frame("main");
			
			driver.switchTo().frame(driver.findElement(By.name("main")));
			
			WebElement header = driver.findElement(By.tagName("h2"));
			
			System.out.println(header.getText());
			
			driver.switchTo().defaultContent();
			
			

	}

}
