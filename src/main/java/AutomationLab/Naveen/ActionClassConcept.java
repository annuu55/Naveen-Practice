package AutomationLab.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
	//	driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		//movetoelement
	/*	WebElement web=driver.findElement(By.xpath("//a[@class='menulink']"));
		Actions action=new Actions(driver);
		action.moveToElement(web).perform();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("COURSES")).click();*/
		
		
		//rightclick
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		Actions action=new Actions(driver);
		action.contextClick(rightclick).perform();
		
		
		
		
	}

}
