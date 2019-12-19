package GURRU99.GURRU99;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareValueTest extends TestBase{
	
	HomePage homeObject ; 
	CompareValuePage compareObject ; 

	
	@Test
	public void ProductCompareValue () {
		
		homeObject = new HomePage(driver);
		homeObject.openHomePage();
		compareObject = new CompareValuePage(driver);
		compareObject.openMobilePage();
		compareObject.openProductDetails();
		
		Assert.assertEquals(compareObject.firsprice, compareObject.secoundsprice);
		System.out.println(compareObject.firsprice);
		System.out.println(compareObject.secoundsprice);

	}
}
