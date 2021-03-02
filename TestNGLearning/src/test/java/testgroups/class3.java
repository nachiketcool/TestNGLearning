package testgroups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class class3 {
	
	@Test (priority=1)
	public void douserReg() {

		System.out.println("user registration");
		Assert.fail("failing user registration");

	}

	@Test(priority=2, dependsOnMethods = {"douserReg"})      // if priority is not set then method will be executed alphabetically
	public void douserLogin() {
		
		System.out.println("logging in user");
		
	} 

	@Test(priority=3,dependsOnMethods = {"douserReg"},alwaysRun = true )      // if priority is not set then method will be executed alphabetically
	public void method3() {
		
		System.out.println("menthod 3 execution");
		
	} 
	
	@Test(priority=4,dependsOnMethods = {"douserReg"} )      // if priority is not set then method will be executed alphabetically
	public void method4() {
		
		System.out.println("method 4 execution");
		
	} 
	
}
