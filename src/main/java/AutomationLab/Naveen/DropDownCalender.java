package AutomationLab.Naveen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCalender {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select=new Select(day);
		select.selectByIndex(31);
		
	/*	Select select1=new Select(month);
		select1.selectByVisibleText("Dec");
		
		Select select2=new Select(year);
		select2.selectByVisibleText("1994");*/
		
		
		selectdrpdwnbyindex(driver,month,12);
		selectDropDownValueByText(year,"1994");
		
		System.out.println(getalloptionlist(day));
		System.out.println(getalloptionlist(month));
		System.out.println(getalloptionlist(year));
		
	
		
	}

	public static void selectdrpdwnbyindex(WebDriver driver,WebElement element,int index)
	{
		Select drpdwn=new Select(element);
		drpdwn.selectByIndex(index);
	}
	public static void selectDropDownValueByText(WebElement element, String value){
		Select drpdwn1 = new Select(element);
		drpdwn1.selectByVisibleText(value);		
	}
	
	public static ArrayList<String> getalloptionlist(WebElement element) {
		
		Select alldrp=new Select(element);
		ArrayList<String> li=new ArrayList<String>();
		
		List<WebElement> optionlist=alldrp.getOptions();
		System.out.println("Total options"+optionlist.size());
		
		for(int i=0;i<optionlist.size();i++)
		{
			String optionval=optionlist.get(i).getText();
			
			li.add(optionval);
		}
		
		
		return li;
		
	}
}
