package AutomationLab.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitsconcept {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/radio-button");
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//1.dynamic wait
			//2.Global wait for element--it will applied for all the webelements by default
			//3.not applicable for non web elements -- title, url, alerts 
			
			WebElement radiobutton=driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
			ClickRadio(driver, radiobutton,10);
			driver.quit();
				

	}
//not recomanded to use both waits at atime
	public static void ClickRadio(WebDriver driver,WebElement element,int timeoutforelement)
	{
		new WebDriverWait(driver,timeoutforelement).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
}
