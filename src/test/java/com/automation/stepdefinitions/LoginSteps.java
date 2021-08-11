package com.automation.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.automation.pageobject.LoginPage;
import com.automation.pageobject.MyAccountPage;
import com.automation.pageobject.MyStorePage;

import cucumber.api.java.en.*;

public class LoginSteps {
	public WebDriver driver = null;
	MyStorePage myStorePage = null;
	LoginPage loginPg = null;
	MyAccountPage myAcctPg =null;
	
	@Given("User has launched chrome browser")
	public void user_has_launched_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\MyTestAutomationDevelopment\\TestAutomationDevelopment\\Drivers\\chromedriver.exe");  
	    // Instantiate a ChromeDriver class.       
	     driver=new ChromeDriver();
	     myStorePage = new MyStorePage(driver);
	}

	@When("User navigates to the Application URL {string}")
	public void user_navigates_to_the_Application_URL(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
	    driver.get(string);
	    Assert.assertEquals(driver.getTitle(), "My Store", "User navigates to Incorrect page");
	}

	@When("Clicks Signin link on the {string} page")
	public void clicks_Signin_link_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   myStorePage.clickSignInLink();
	}

	@Then("Navigates to {string} Page")
	public void navigates_to_Page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals(driver.getTitle(), string, "User navigates to Incorrect page");
	}

	@When("Enters username as {string} and password as {string}")
	public void enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		loginPg = new LoginPage(driver);
	    loginPg.enterUsername(string);
	    loginPg.enterPassword(string2);
	}

	@When("Clicks on SignIn button on the {string} page")
	public void clicks_on_SignIn_button_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    loginPg.clickSignInButton();
	}

	@Then("User validates {string} Account Information page")
	public void user_validates_Account_Information_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		myAcctPg = new MyAccountPage(driver);
		Assert.assertEquals(myAcctPg.getUserProfileName(), string, "Incorrect User Profile Name");
	}

	@When("Clicks Signout link on the {string} page")
	public void clicks_Signout_link_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    myAcctPg.clickSignOut();
	}

	@Then("Quit Launched Browser")
	public void quit_Launched_Browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}



}
