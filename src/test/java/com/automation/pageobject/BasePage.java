package com.automation.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.automation.utility.ConfigureProperties;

import cucumber.api.java.Before;
import io.cucumber.core.logging.Logger;



public class BasePage {
	
	public WebDriver driver;
	public MyStorePage myStorePg;
	public LoginPage loginPg;
	public MyAccountPage myAcctPg;
	String browser = "";
	WebDriverWait explicitWait =null;
	public long explicitWaitTime = Long.parseLong(ConfigureProperties.readProperties("Explicit_Wait"));
	public long implicitWaitTime =Long.parseLong(ConfigureProperties.readProperties("Implicit_Wait"));
	public static org.apache.log4j.Logger logger;
	
	
	public void openBrowser() {
		browser = ConfigureProperties.readProperties("Browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",ConfigureProperties.readProperties("Chrome_Exe"));
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",ConfigureProperties.readProperties("Firefox_Exe"));
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("No Browser Selected");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
	}
	
	public void explicityWaitForElement(WebElement element, long timeOutinSeconds) {
		explicitWait = new WebDriverWait(driver, timeOutinSeconds);
		explicitWait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
