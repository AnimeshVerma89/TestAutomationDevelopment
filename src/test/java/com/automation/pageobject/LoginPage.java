package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver	, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement usernameWb;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement passwordWb;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitLoginWb;

	public WebElement getUsernameWb() {
		return usernameWb;
	}

	public void setUsernameWb(WebElement usernameWb) {
		this.usernameWb = usernameWb;
	}

	public WebElement getPasswordWb() {
		return passwordWb;
	}

	public void setPasswordWb(WebElement passwordWb) {
		this.passwordWb = passwordWb;
	}

	public WebElement getSubmitLoginWb() {
		return submitLoginWb;
	}

	public void setSubmitLoginWb(WebElement submitLoginWb) {
		this.submitLoginWb = submitLoginWb;
	}
	
	public void enterUsername(String uName) {
		explicityWaitForElement(getUsernameWb(), explicitWaitTime);
		getUsernameWb().sendKeys(uName);
	}
	
	public void enterPassword(String pwd) {
		getPasswordWb().sendKeys(pwd);
	}
	
	public void clickSignInButton() {
		explicityWaitForElement(getSubmitLoginWb(), explicitWaitTime);
		getSubmitLoginWb().click();
	}
}
