package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test2 {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
        driver.get("https://kite.zerodha.com/");
        driver.manage().window().maximize();
		
		login log = new login (driver);
		
		log.enterUN();
		  Thread.sleep(2000);
		log.enterpass();
		  Thread.sleep(2000);
		log.clickbutton();
		
		login2 log2=new login2(driver);
		log2.enterPIN();
		  Thread.sleep(2000);
		log2.cotinue();
		
		Home hom= new Home (driver);
		hom.PN();
	}

}
