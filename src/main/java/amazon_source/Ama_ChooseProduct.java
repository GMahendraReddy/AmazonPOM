package amazon_source;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_ChooseProduct {
	
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	WebElement selectresult;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")
	WebElement ClickBooks;
	
	
	public void selectresult_() {
		selectresult.click();
	}
	public void ClickBooks_() {
		ClickBooks.click();
	}
	public Ama_ChooseProduct (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	}
