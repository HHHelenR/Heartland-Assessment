package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {
	
	WebDriver driver;

	public Checkoutpage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "customer-email")
	WebElement customerEmailBar;
	
	@FindBy(xpath = "//input[@name='firstname']") 
	WebElement firstNameBar;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastNameBar;
	
	@FindBy(xpath = "//input[@name='street[0]']")
	WebElement streetAddressBar;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement cityBar;
	
	@FindBy(xpath = "//select[@name='region_id']")
	WebElement stateBar;
	
	@FindBy(xpath = "//input[@name='postcode']")
	WebElement zipCodeBar;
	
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement phoneNumberBar;
	
	@FindBy(xpath = "(//input[@class='radio'])[1]")
	WebElement tableRateBtn;
	
	@FindBy(xpath = "//button[@data-role='opc-continue']")
	WebElement nextBtn;
	
	public Paymentpage fillCustomInfo(){
		customerEmailBar.sendKeys("123@abc.com");
		firstNameBar.sendKeys("Heart");
		lastNameBar.sendKeys("Land");
		streetAddressBar.sendKeys("123 45st");
		cityBar.sendKeys("New York");
		Select dropdown = new Select(stateBar);
		dropdown.selectByIndex(1);;
		zipCodeBar.sendKeys("11111");
		phoneNumberBar.sendKeys("123456789");
		tableRateBtn.click();
		nextBtn.click();
		return new Paymentpage(driver);
	}
}
