package AutomationLab.Naveen;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
	
		Properties prop=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Practice\\Naveen\\Naveen\\src\\main\\java\\config.properties");
		
		prop.load(ip);
	
    	String url=	prop.getProperty("browserurl");	
    	System.out.println(url);
    	
    	String browserName=prop.getProperty("browser");
    	
    	
    	
    	if(browserName.equals("chrome"))
    	{
    		 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe"); 
    		 driver=new ChromeDriver();
    	}
  /*  	else if(browserName.equals("IE")){
			driver = new InternetExplorerDriver();
		}*/
		else{
			System.out.println("no browser value is given");
		}
    	
    	driver.get(prop.getProperty("browserurl"));
    	
    	driver.findElement(By.id(prop.getProperty("FullName_id"))).sendKeys("Anna");
    	//driver.findElement(By.id(prop.getProperty("Button_id"))).click();
    	
    	//driver.close();
	}

}
