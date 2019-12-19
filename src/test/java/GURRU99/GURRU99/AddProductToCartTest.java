package GURRU99.GURRU99;

import org.testng.annotations.Test;

public class AddProductToCartTest extends TestBase{
	
	HomePage home ; 
	MobilePage mobile ; 
	CartPage cart ; 
	 
	
	@Test
	public void USERADDPRODUCTTOCART () {
		
		home = new HomePage(driver);
		home.openHomePage();
		
		mobile = new MobilePage(driver) ; 
		mobile.AddProductToCart();
		
		cart = new CartPage(driver) ; 
		cart.EDITQTYBUtton();  
		mobile.EDITQTY("1000");
		mobile.updatqty();	
		cart.OPENCARTPAGE();
		cart.RemoveItem();
		
	}
}
