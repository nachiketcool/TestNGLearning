package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class class3 {
	
	@Test (priority=1,groups = {"Functional","Smoke"})
	public void douserReg() {

		System.out.println("user registration");
	
	}

	@Test(priority=2,groups = {"Functional","Smoke"})    
	public void douserLogin() {
		
		System.out.println("logging in user");
		
	} 

	@Test(priority=3,alwaysRun = true, groups = "Smoke" )     
	public void method3() {
		
		System.out.println("menthod 3 execution");
		
	} 
	
	@Test(priority=4,groups = "bvt")     
	public void method4() {
		
		System.out.println("method 4 execution");
		
	} 
	
}
