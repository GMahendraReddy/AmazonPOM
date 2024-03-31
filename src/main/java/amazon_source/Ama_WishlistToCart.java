package amazon_source;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_WishlistToCart {

	
WebDriver driver;
	
	@FindBy(linkText="View Your List")
	WebElement viewyourlist;
	@FindBy(xpath="(//a[@class='a-button-text a-text-center'])[1]")
	WebElement addbacktocart;


public void viewyourlist_() {
	viewyourlist.click();
}
public void addbacktocart_() {
	addbacktocart.click();
}

public Ama_WishlistToCart(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
}
