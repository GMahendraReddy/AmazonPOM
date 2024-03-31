package amazon_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_AddtoCartPage {
	
	WebDriver driver;
	
	@FindBy(id="add-to-cart-button")
	WebElement CartButton;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement shoeprice;
	
	public String shoeprice_() {
		return shoeprice.getText();
	}
	@FindBy(xpath="(//span[@class='a-size-medium a-color-price header-price a-text-normal'])")
	WebElement bookprice;
	
	public String bookprice_() {
		return bookprice.getText();
	}
	
	public void AddtoCartButton_() {
//		Set<String> ParentChild = driver.getWindowHandles();
//		Iterator<String> PandC = ParentChild.iterator();
//		String parent = PandC.next();
//		String child = PandC.next();
//		driver.switchTo().window(child);
		
		CartButton.click();
	}
	
	public Ama_AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

}
