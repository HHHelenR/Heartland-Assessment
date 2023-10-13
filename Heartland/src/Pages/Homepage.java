package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import Elements.Elements;

public class Homepage extends Elements {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		driver.get("https://magento.softwaretestingboard.com/");
	}

}
