package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.Home;
import zerodha.login;
import zerodha.login2;

public class testing1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass () {
		
		System.out.println(" Before class");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
         ChromeOptions opt=new ChromeOptions();
         
         opt.addArguments("--disable-notification");
         
         WebDriver driver =new ChromeDriver(opt);
         
         driver.get("https://kite.zerodha.com/");
         
	}
         
         @BeforeMethod 
       public void loginTOApplication() {
        	 
        	 System.out.println("before method");
        	 
        	 login log=new login (driver);
        	 
        	 log.enterUN();
        	 log.enterpass();
        	 log.clickbutton();
        	 
        	 login2 log2=new login2(driver);
        	 
        	 log2.enterPIN();
        	 log2.cotinue();
         }
         
         @Test
         public void verifyorderpage() {
        	 
        	 System.out.println("test");
        	 
        	 Home hom=new Home (driver);
        	 
        	 hom.orderElement();
        	 
        	 String actualurl=driver.getCurrentUrl();
        	// String actualtitle=driver.getTitle();
        	 
        	 String expectedurl= "https://kite.zerodha.com/orders";
        	 
        	 if (expectedurl.equals(actualurl)) {
        		 
        		 System.out.println("pass");
        	 }
        	 else {
        		 System.out.println("fail");
        	 }
         }
         
         @Test
         
         public void verifyholdingspage() {
        	 
        	 System.out.println("test2");
        	 
        	 Home hom2=new Home (driver);
        	 
        	 hom2.hodingElement();
        	 
        	 String actualurl2=driver.getCurrentUrl();
        	 
        	 String expectedurl2="https://kite.zerodha.com/holdings";
        	 
        	 if (expectedurl2.equals(actualurl2)) {
        		 System.out.println("pass");
        	 }
        	 else {
        		 System.out.println("fail");
        	 }
         }
         
         @Test
         
         public void verifypositionpage() {
        	 
        	 System.out.println("test3");
        	 
        	 Home hom3=new Home(driver);
        	 
        	 hom3.positionsElement();
        	 
        	 String actualurl3=driver.getCurrentUrl();
        	 
        	 String expectedurl3="https://kite.zerodha.com/positions";
        	 
        	 if (expectedurl3.equals(actualurl3)) {
        		 
        		 System.out.println("pass");
        	 }
        	 else {
        		 
        		 System.out.println("fail");
        	 }
        	 
        	 }
         
//         @AfterMethod
//         
//         public void aftermethod() {
//        	 
//        	 System.out.println("after method");
//        	 
//        		 
//        		WebElement myprofile=driver.findElement(By.xpath("//span[@class='user-id']"));
//        		
//        		WebElement logout=driver.findElement(By.xpath("//a[@target='_self']"));
//        		
//        		Actions act= new Actions(driver);
//        		
//        		act.moveToElement(myprofile).moveToElement(logout).click().build().perform();
//         }
//         
//         @AfterClass
//         
//         public void afterclass() {
//        	 
//        	 System.out.println("after class");
//        	 
//        	 driver.close();
//         }
        	 
         
        	 
        	 
        	 
     
         
         
		
	}


