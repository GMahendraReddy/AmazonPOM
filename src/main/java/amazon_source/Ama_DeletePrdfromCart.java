package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_DeletePrdfromCart {
	
	WebDriver driver;
	@FindBy(name="submit.delete.e2d01063-4e85-45b2-b06f-d55ea816a246")
	WebElement DeletePrdfromCart;
	
	public void DeletePrdfromCart_() {
		DeletePrdfromCart.click();
	}

	public Ama_DeletePrdfromCart(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


}
