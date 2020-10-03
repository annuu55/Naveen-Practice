package AutomationLab.Naveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");   
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		

		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String BeforeXpath="//*[@id='customers']/tbody/tr[";
		String AfterXpath="]/td[1]";
		
		
		
		List<WebElement> totalsize =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println(totalsize.size());
		
		for(int i=2;i<=7;i++)
		{
			String ActualXpath=BeforeXpath+i+AfterXpath;
			WebElement element=driver.findElement(By.xpath(ActualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Centro comercial Moctezuma")) {
			System.out.println("Company name:"+element.getText()+"is found"+ "at position:"+(i-1));
			}
		}

		driver.quit();
	}

}
