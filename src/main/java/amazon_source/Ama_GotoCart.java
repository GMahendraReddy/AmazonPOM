package amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_GotoCart {
	
WebDriver driver;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[1]")
	WebElement gotocart;


public void gotocart_() {
	gotocart.click();
}
@FindBy(xpath="(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]")
WebElement totalprice;


public String totalprice_() {
	return totalprice.getText();
}

@FindBy(id="sc-subtotal-label-activecart")
WebElement zerocart;


public String zerocart_() {
	return zerocart.getText();
}
@FindBy(xpath=("(//input[@value='Delete'])[1]"))
WebElement delete;


public void delete_() {
	delete.click();
}


public Ama_GotoCart(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}

}
