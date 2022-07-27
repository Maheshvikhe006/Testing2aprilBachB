package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy (xpath="//span[@class='user-id']") private WebElement profilename;
	
	@FindBy (xpath="//a[@href='/orders']") private WebElement orders;
	
	@FindBy (xpath="//a[@href='/holdings']") private WebElement holdings;
	
	@FindBy (xpath="//a[@href='/positions']") private WebElement positions;
	
	@FindBy (xpath="//a[@target='_self']") private WebElement logout;
	
	
	
	public Home (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void PN () {
		profilename.click();
	}
	
	public void orderElement() {
		
		orders.click();
	}
	
	public void hodingElement() {
		holdings.click();
	}
	
	public void positionsElement() {
		
		positions.click();
	}
	
	public void logout() {
		
		logout.click();
		
	}

}
