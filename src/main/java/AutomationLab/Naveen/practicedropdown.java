package AutomationLab.Naveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicedropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
		
	    WebDriver	driver=new ChromeDriver();
		 
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
		//By country = By.id("Form_submitForm_Country");
		//By industry = By.id("Form_submitForm_Industry");
		
		selectDropDownValueByVisibleText(country, "India");
	//	selectDropDownValueByIndex(industry, 3);

	}

	public static  void selectDropDownValueByVisibleText(WebElement element, String value)
	{
		Select select = new Select((element));
		select.selectByVisibleText(value);
	}
}
