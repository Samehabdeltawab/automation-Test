package GURRU99.GURRU99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends PageBase{

	public CartPage(WebDriver driver) {
		super(driver);

	}

	@FindBy (linkText = "Edit")
	WebElement editlink ; 

	@FindBy (css = "li.error-msg")
	WebElement errormessage ;
	
	@FindBy (linkText = "Remove Item")
	WebElement deletelink ;
	
	@FindBy (css = "div.cart-empty")
	WebElement cartempty ; 

	public void EDITQTYBUtton () {

		clickButton(editlink);
	}
	
	public void OPENCARTPAGE() {

		Assert.assertTrue(errormessage.getText().contains("The maximum quantity allowed for purchase is 500."));
		System.out.println("The maximum quantity allowed for purchase is 500.");
	}
	
	public void RemoveItem () {
		
		clickButton(deletelink);
		
		Assert.assertTrue(cartempty.getText().contains("You have no items in your shopping cart."));
		System.out.println("You have no items in your shopping cart.");
	}
}
