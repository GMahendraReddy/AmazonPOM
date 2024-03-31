package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_ProceedtoBuyNow {
	
WebDriver driver;
	
	
	@FindBy(css="input.a-button-input[name=proceedToRetailCheckout]")
	WebElement ProceedtoBuyButton;
	
	
	public void ProceedtoBuyButton_() {
		ProceedtoBuyButton.click();
	}
	public Ama_ProceedtoBuyNow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
