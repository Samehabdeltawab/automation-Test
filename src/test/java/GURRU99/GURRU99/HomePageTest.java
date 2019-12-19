package GURRU99.GURRU99;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{

	HomePage homeObject ; 


	@Test 
	public void TestMobilePage() {

		homeObject = new HomePage(driver);
		Assert.assertEquals(driver.getTitle(), "Home page");
		System.out.println("Home page");
		homeObject.openHomePage();
		Assert.assertEquals(driver.getTitle(), "Mobile");
		System.out.println("Mobile");
		homeObject.openMobilePage();
	}

}
