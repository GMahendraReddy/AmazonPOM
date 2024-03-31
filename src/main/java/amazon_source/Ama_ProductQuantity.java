package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_ProductQuantity {
	
	WebDriver driver;
	@FindBy(xpath="(//i[@class='a-icon a-icon-dropdown'])[1]")
	WebElement cartproductquantitydrd;
	
	@FindBy(xpath="(//li[@class='a-dropdown-item quantity-option'])[3]")
	WebElement cartproductquantityinc;


	public void cartproductquantitydrd_() {
		cartproductquantitydrd.click();
	}
	public void cartproductquantityinc_() {
		cartproductquantityinc.click();
	}

	public Ama_ProductQuantity(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
