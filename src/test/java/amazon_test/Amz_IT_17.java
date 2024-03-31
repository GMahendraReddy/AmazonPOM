package amazon_test;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import amazon_source.Ama_AddtoCartPage;
//import amazon_source.Ama_CartPage;
import amazon_source.Ama_ChooseProduct;
import amazon_source.Ama_GotoCart;
import amazon_source.Ama_Search;
import base.Ama_LaunchQuit;
import amazon_source.Ama_LoginDDT;
import amazon_source.Ama_LoginPage;

public class Amz_IT_17 extends Ama_LaunchQuit{
	
	@Test
	public void delprodfromcart() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Ama_LoginPage login = new Ama_LoginPage(driver);
		Ama_LoginDDT.getdata();
		login.username_();
		login.password_();
		Ama_Search search=new Ama_Search(driver);
		search.search_tf_();
		Ama_ChooseProduct chprod=new Ama_ChooseProduct(driver);
		chprod.selectresult_();
		Set<String> ParentChild = driver.getWindowHandles();
		Iterator<String> PandC = ParentChild.iterator();
		String parent = PandC.next();
		String child = PandC.next();
     	driver.switchTo().window(child);
     	Ama_AddtoCartPage addtocart=new Ama_AddtoCartPage(driver);
		
		addtocart.AddtoCartButton_();
		search.searchbooks_();
		chprod.ClickBooks_();
		Set<String> ParentChild1 = driver.getWindowHandles();
		Iterator<String> PandC1 = ParentChild1.iterator();
		String parent1 = PandC1.next();
		String child1 = PandC1.next();
		String child2 = PandC1.next();
		driver.switchTo().window(child2);
		
		addtocart.AddtoCartButton_();
		Ama_GotoCart gotocart=new Ama_GotoCart(driver);
		gotocart.gotocart_();
		
//		String zerocart1 = gotocart.zerocart_();
//		gotocart.delete_();\
		WebElement del = driver.findElement(By.xpath("(//input[@value='Delete'])[1]"));
		while(del.isDisplayed()) {
			
//		try{
			del.click();
//		}
//		catch(StaleElementReferenceException a) {
//			del = driver.findElement(By.xpath("(//input[@value='Delete'])[1]"));
//			del.click();
		}
//		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
//		w.until(ExpectedConditions.visibilityOf(del));
		}
//		System.out.println("tryehwj");
		
//		xpath=("(//input[@value='Delete'])[1]")
//		Assertion a=new Assertion();
//		a.assertEquals(b,true);	
		
	}


