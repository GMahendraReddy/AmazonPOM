package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.Constants;

public class Ama_LaunchQuit {
	
	public static WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void amazonURLaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if(browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(Constants.URL);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void amazonquit() {
		driver.quit();
	}

}
