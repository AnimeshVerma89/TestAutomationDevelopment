package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStorePage extends BasePage {
	
	public MyStorePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver	, this);
	}
	
	
	@FindBy(linkText = "Sign in")
	private WebElement signInLink;

	public WebElement getSignInLink() {
		return signInLink;
	}

	public void setSignInLink(WebElement signInLink) {
		this.signInLink = signInLink;
	}

	public void clickSignInLink() {
		explicityWaitForElement(getSignInLink(), explicitWaitTime);
		getSignInLink().click();
		
	}
}
