package AutomationLab.Naveen;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefr_srshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\New Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//google
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());//amz
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//google

		driver.navigate().refresh();	
		
	//	takePageScreenshot(driver, "loginpage");
		
		driver.quit();
		
	}
	
/*	public static void takePageScreenshot(WebDriver driver, String fileName){
		File SrcFile = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

}
