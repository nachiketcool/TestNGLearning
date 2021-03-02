package testgroups;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 

public class testngclass { 
	
	@BeforeTest                           // called only once in the class 
	public void creatDBconn() { 
		
		System.out.println("Creating DB connection");
		
	}
	
	@AfterTest
	public void closeDBconn() {
		
		System.out.println("Closing DB connection");
		
	}
	
	@BeforeMethod                     // called before execution of every method (testcase) inside the class
	public void launchBrowser() {
		
		System.out.println("Launcing browser");
	} 
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing browser");
	}

	@Test(priority=2)      // if priority is not set then method will be executed alphabetically
	public void douserLogin() {
		
		System.out.println("logging in user");
		
	} 

	@Test (priority=1)
	public void douserReg() {

		System.out.println("user registration");

	}

}
