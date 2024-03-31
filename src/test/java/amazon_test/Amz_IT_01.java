package amazon_test;
//Validation Of LogIn Page

import java.io.IOException;
//import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import amazon_source.Ama_LoginDDT;
import amazon_source.Ama_LoginPage;
import amazon_source.DataProvider_Login;
import base.Ama_LaunchQuit;

//@Listeners(utils.SuiteListener.class)
public class Amz_IT_01 extends Ama_LaunchQuit{ //extends Ama_LaunchQuit
	
	
//	String username;
	
	@Test (dataProvider="LoginCredentials", dataProviderClass = DataProvider_Login.class)                                         //(retryAnalyzer = utils.RetryTest.class)
	public void validationofloginpage(String un1, String pwd1) throws EncryptedDocumentException, IOException {
		
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ama_LoginPage login = new Ama_LoginPage(driver);
//		Ama_LoginDDT.getdata();
		login.credentials(un1, pwd1);
//		login.username_();
//		login.password_();
//		Assertion a = new Assertion();
//		a.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

}
