package AutomationLab.Naveen;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopHandle {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.linkText("Good PopUp #3")).click();
			
			Set<String> handels=driver.getWindowHandles();
			Iterator<String> it=handels.iterator();
			
		String	parentWidnowId=it.next();
        System.out.println("parent window id: " + parentWidnowId);
		
		String childWindowId = it.next();
		System.out.println("child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWidnowId);
		System.out.println("parent window title is: " + driver.getTitle());
		driver.quit();
			

	}

}
