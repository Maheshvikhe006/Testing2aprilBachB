package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 
public class testNG {
	
	
	@BeforeClass
    public void beforeclass() {
		
		System.out.println("before class");
	}
	
	@Test
	public void test() {
		
		System.out.println("test");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("after class");
	}
	
	
	
	

}
