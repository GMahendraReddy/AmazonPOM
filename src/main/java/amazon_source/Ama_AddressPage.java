package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_AddressPage {

	WebDriver driver;
	@FindBy(className="(//input[@class='a-button-input'])[1]")
	WebElement UseAddressButton;
	
	public void UseAddressButton_() {
		UseAddressButton.click();
	}
	
	public Ama_AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
