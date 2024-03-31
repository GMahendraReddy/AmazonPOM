package amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ama_LoginPage {//extends Ama_LoginDDT
	
	WebDriver driver;
	
	@FindBy(id="ap_email")
	WebElement username1;
	
	@FindBy(id="ap_password")
	WebElement password1;
//
//	public void username_() {
//		username1.sendKeys(username + Keys.ENTER);
//	}
//	public void password_() {
//		password1.sendKeys(password + Keys.ENTER);
//	}
	public void credentials(String un,String pwd) {
		username1.sendKeys(un + Keys.ENTER);
		password1.sendKeys(pwd + Keys.ENTER);
	}
	public Ama_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
