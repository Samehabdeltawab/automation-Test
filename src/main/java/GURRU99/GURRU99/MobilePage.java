package GURRU99.GURRU99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MobilePage extends PageBase{

	public MobilePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (linkText = "SONY XPERIA")
	WebElement sonylink ; 

	@FindBy(css = "button.button.btn-cart")
	WebElement cartlink ; 
	
	
	
	@FindBy (id = "qty")
	WebElement qtyText ; 
	
	@FindBy (css = "button.button.btn-cart")
	WebElement updatelink ; 
	
	 


	public void AddProductToCart () {
		
		clickButton(sonylink);
		clickButton(cartlink);
	}
	
	
	public void EDITQTY (String updateqty) {
		
		qtyText.clear();
		setTextElementText(qtyText, updateqty);
		
	}
	
	public void updatqty () {
		
		clickButton(updatelink);
	}

		
	
}
