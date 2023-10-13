package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Elements.Elements;

public class SearchReultpage extends Elements{
	
	WebDriver driver;
	
	public SearchReultpage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="(//a[@class='product photo product-item-photo'])[1]")
	WebElement top1;

	 public Productpage goToProductpage() {
		 top1.click();
		 return new Productpage(driver);
		
	 }
}
