package AutomationLab.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {

	public static void main(String[] args) throws Exception {
		
        System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String s=driver.getTitle();
		System.out.println("Title is:"+s);
		
		if(s.equals("Tools"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Wrong Title");
		}

	//	Thread.sleep(4000);
		//css locator
		driver.findElement(By.cssSelector("input[id=firstName]")).sendKeys("Kiny");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Shinde");
		driver.findElement(By.id("userNumber")).sendKeys("9404745678");
		driver.findElement(By.cssSelector("input[id=userEmail]")).sendKeys("Kunal@gmail.com");
		Thread.sleep(4000);
		
		
		//radio selector
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
		
		WebElement forgotPwdLink = driver.findElement(By.id("submit"));
		scrollIntoView(forgotPwdLink, driver);
		
		forgotPwdLink.click();
		
		
		
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
