package amazon_test;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import amazon_source.Ama_Search;
import base.Ama_LaunchQuit;
import amazon_source.Ama_LoginDDT;
import amazon_source.Ama_LoginPage;
import amazon_source.Ama_Search;

//Validation Of Home Page searching Product


public class Amz_IT_02 extends Ama_LaunchQuit{
	@Test
	public void homepagesearching() throws EncryptedDocumentException, IOException {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ama_LoginPage login = new Ama_LoginPage(driver);
		Ama_LoginDDT.getdata();
		login.username_();
		login.password_();
		Ama_Search search = new Ama_Search(driver);
		search.search_tf_();
		Assertion a = new Assertion();
		a.assertEquals(driver.getTitle(), "Amazon.in : Shoes");
	}
	

}
