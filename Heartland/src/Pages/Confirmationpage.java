package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmationpage {

	WebDriver driver;

	public Confirmationpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='base']")
	WebElement successMsg;
	
	public void confirmConfirmationTxt() {
		assertEquals(successMsg.getText(), "Thank you for your purchase!");
	}
}
