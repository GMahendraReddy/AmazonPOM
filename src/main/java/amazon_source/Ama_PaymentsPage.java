package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_PaymentsPage {
	
	
	@FindBy(id="pp-17Eaqr-1064")
	WebElement ChoosingCOD;
	
	@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	WebElement UsePaymentButton;
	
	public void ChoosingCOD_() {
		ChoosingCOD.click();
	}
	public void UsePaymentButton_() {
		UsePaymentButton.click();
	}
	
	public Ama_PaymentsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
