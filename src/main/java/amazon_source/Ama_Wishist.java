package amazon_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_Wishist {
	
	WebDriver driver;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishistbutton;


public void wishistbutton_() {
	
	Set<String> ParentnChild =  driver.getWindowHandles();
	Iterator<String> pandc = ParentnChild.iterator();
	String Parent = pandc.next();
	String Child = pandc.next();
	driver.switchTo().window(Child);
	
	wishistbutton.click();
}

public Ama_Wishist(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
}