package GURRU99.GURRU99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (linkText = "MOBILE")
	WebElement mobilelink ; 

	@FindBy (xpath = "//select[@title = 'Sort By']")
	WebElement sortbyls ; 
	
	public void openHomePage () {
		
		clickButton(mobilelink);
	}
	
	public void openMobilePage () {
		
		Select selectsortbyls = new Select(sortbyls);
		selectsortbyls.selectByVisibleText("Name") ;
	}

}
