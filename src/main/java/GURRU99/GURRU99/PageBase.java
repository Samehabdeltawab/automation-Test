package GURRU99.GURRU99;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver ; 
	public JavascriptExecutor jse ; 


	public PageBase (WebDriver driver) {

		PageFactory.initElements(driver, this);	
	}

	public static void clickButton (WebElement button) {

		button.click();		
	}

	public static void setTextElementText (WebElement textElement , String Value ) {

		textElement.sendKeys(Value);
	}

}
