package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	// Step 1 declare variable globally(data member)
	
      @FindBy (xpath="//input[@type='text']") private WebElement username;
      
      @FindBy (xpath="//input[@type='password']") private WebElement password;
      
      @FindBy (xpath="//button[@type='submit']") private WebElement loginbutton;
      
      // step 2 initialization global data member
      
      public login (WebDriver driver) {
    	  
    	  PageFactory.initElements(driver, this);
    	  
      }
      
      //step 3 method creation
      
      public void enterUN () {
    	  username.sendKeys("OKP335");
      }
      public void enterpass () {
    	  password.sendKeys("WSX12345");
      }
      public void clickbutton()
      {
    	  loginbutton.click();
      }
}
