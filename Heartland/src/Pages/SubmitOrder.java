package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Elements.BaseTest;
import Elements.Elements;


public class SubmitOrder extends BaseTest {
	
	@Test
	public void submitOrderTest() throws InterruptedException {
		
		Homepage homepage = new Homepage(driver);
		homepage.goTo();
		Elements elements = new Elements(driver);
		elements.searchProduct("top");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		SearchReultpage searchResultpage = new SearchReultpage(driver);
		searchResultpage.goToProductpage();
		Productpage productpage = new Productpage(driver);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)");
		productpage.addProductToCart();
		Thread.sleep(3000);
		productpage.goToCartPage();	
		Thread.sleep(3000);	
		Checkoutpage checkoutpage = new Checkoutpage(driver);
		checkoutpage.fillCustomInfo();
		Paymentpage paymentpage = new Paymentpage(driver);
		Thread.sleep(3000);	
		js.executeScript("window.scrollBy(0,400)");
		paymentpage.placeOrder();
		Thread.sleep(3000);
		Confirmationpage confirmationpage = new Confirmationpage(driver);
		confirmationpage.confirmConfirmationTxt();
		
	}
}
