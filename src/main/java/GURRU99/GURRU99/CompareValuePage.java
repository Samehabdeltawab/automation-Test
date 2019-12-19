package GURRU99.GURRU99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareValuePage extends PageBase{

	public CompareValuePage(WebDriver driver) {
		super(driver);
		
	}
	
	public String firsprice ; 
	public String secoundsprice  ; 
	
	
	@FindBy (id = "product-price-1")
	WebElement productprice; 

	@FindBy (linkText = "SONY XPERIA")
	WebElement sonylink ; 
	
	

	public void openMobilePage () {
		
	 firsprice = productprice.getText();
		clickButton(sonylink);
		
	}
	
	public void openProductDetails () {
		
		 secoundsprice = productprice.getText();
		 
		
	}
}
