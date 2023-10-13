package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage {
	
	WebDriver driver;

	public Paymentpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@title='Place Order']")
	WebElement placeOrderBtn;
	
	public Confirmationpage placeOrder() {
		placeOrderBtn.click();
		return new Confirmationpage(driver);
	}
	
}
