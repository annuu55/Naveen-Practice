package AutomationLab.Naveen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {

//Pre-conditions annotation 
	@BeforeSuite
	public void connectDB() {
		System.out.println("BeforeSuite -- connect to DB");
	}

	@BeforeTest
	public void createUserInDB() {
		System.out.println("BeforeTest -- create User In DB");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BeforeClass -- Launch browser");
	}

	// 4//7//10//13
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BeforeMethod -- loginToApp");
	}
	//Test cases
//5
	@Test
	public void homePageTitleTest() {
		System.out.println("homePage Title Test");
	}
//8
	@Test(enabled=false)//to disable test case
	public void homePageSearchTest() {
		System.out.println("homePage search Test");
	}

	// 11
	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageAdvSearchTest() {
		System.out.println("homePage adv search Test");
		int i=9/0;
	}

	// 14
	@Test
	public void homePageProfileTest() {
		System.out.println("homePage profile Test");
	}

//Post conditions annotation 
	// 6//9//12//15
	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod -- logout");
	}
//16
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass -- close browser");
	}
//17
	@AfterTest
	public void deleteUserInDB() {
		System.out.println("AfterTest -- delete user in DB");
	}
//18
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AfterSuite -- disconnect DB");
	}

}
