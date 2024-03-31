package amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_Search {
	
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	public void search_tf_() {
		search_tf.sendKeys("Shoes" + Keys.ENTER);
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbooks;
	
	public void searchbooks_() {
		searchbooks.sendKeys("Books" + Keys.ENTER);
	}
	
	public Ama_Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
