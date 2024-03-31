package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import base.Ama_LaunchQuit;

public class SuiteListener implements ITestListener{
    
	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		Reporter.log("Test Execution Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
//		TakesScreenshot driver = null;
		TakesScreenshot ts= (TakesScreenshot) Ama_LaunchQuit.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Mahi\\eclipse-workspace\\PageObjectModelProject\\screenshot\\pass"+Math.random()+".jpg");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
//		TakesScreenshot driver = null;
		TakesScreenshot ts= (TakesScreenshot) Ama_LaunchQuit.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Mahi\\eclipse-workspace\\PageObjectModelProject\\screenshot\\fail"+Math.random()+".jpg");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test Skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		Reporter.log("Test Failed due to TimeOut");
	}

}
