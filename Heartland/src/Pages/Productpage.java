package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Elements.Elements;

public class Productpage extends Elements {

	WebDriver driver;

	public Productpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "option-label-size-143-item-166")
	WebElement size;

	@FindBy(id = "option-label-color-93-item-49")
	WebElement color;
	
	@FindBy(id = "qty")
	WebElement qtyBtn;

	@FindBy(id = "product-addtocart-button")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/checkout/cart/'])[1]")
	WebElement goToShoppingBtn;
	
	@FindBy(id = "top-cart-btn-checkout")
	WebElement proceedToCheckoutBtn;

	public void addProductToCart() {
		size.click();
		color.click();
		qtyBtn.sendKeys(Keys.DELETE);
		qtyBtn.sendKeys("2");
		addToCartBtn.click();
	}
	
	public Paymentpage goToCartPage() {
		goToShoppingBtn.click();
		proceedToCheckoutBtn.click();
		return new Paymentpage(driver);
	}	

}
