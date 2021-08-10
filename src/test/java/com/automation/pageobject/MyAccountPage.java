package com.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver	, this);
	}

	@FindBy(xpath = "//a[@title='View my customer account']/span")
	private WebElement userProfileWb;
	
	@FindBy(xpath = "//p[@class='info-account']")
	private WebElement welcomeMsgWb;
	
	@FindBy(xpath = "//a[@title='Log me out']")
	private WebElement signOutLinkWb;

	public WebElement getSignOutLinkWb() {
		return signOutLinkWb;
	}

	public void setSignOutLinkWb(WebElement signOutLinkWb) {
		this.signOutLinkWb = signOutLinkWb;
	}

	public WebElement getUserProfileWb() {
		return userProfileWb;
	}

	public void setUserProfileWb(WebElement userProfileWb) {
		this.userProfileWb = userProfileWb;
	}

	public WebElement getWelcomeMsgWb() {
		return welcomeMsgWb;
	}

	public void setWelcomeMsgWb(WebElement welcomeMsgWb) {
		this.welcomeMsgWb = welcomeMsgWb;
	}
	
	public String getUserProfileName() {
		String userProfile = getUserProfileWb().getText().trim();
		return userProfile;
	}
	
	public String getWelcomeMessage() {
		String welcomeMsg = getWelcomeMsgWb().getText().trim();
		return welcomeMsg;	
	}
	
	public void clickSignOut() {
		explicityWaitForElement(getSignOutLinkWb(), explicitWaitTime);
		getSignOutLinkWb().click();
	}
}
