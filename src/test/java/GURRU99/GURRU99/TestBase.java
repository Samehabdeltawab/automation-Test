package GURRU99.GURRU99;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class TestBase {
	public static WebDriver driver ;
	
	@BeforeSuite
	public void TestBase () {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS) ;
		driver.navigate().to(" http://live.demoguru99.com/index.php");
	}
	
	@AfterSuite
	public void stopDriver() {

		driver.quit(); 

}
}
