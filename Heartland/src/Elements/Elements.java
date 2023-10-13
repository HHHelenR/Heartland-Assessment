package Elements;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
	
WebDriver driver;
	
	public Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='action showcart']")
	WebElement cartHeader;
	
	@FindBy(id="//a[@top-cart-btn-checkout']")
	WebElement proceedToCheckooutBtn;
	
	@FindBy(id = "search")
	WebElement searchBar;
	
	public void waitForElementToBeClickable(WebElement findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(findBy)).click();		
	}
	
	public void searchProduct (String productName) {
		searchBar.sendKeys(productName);
		searchBar.sendKeys(Keys.ENTER);	
}

}