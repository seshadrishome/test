package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - Object Repository:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy (xpath="//font[contains(text(),'Sign Up')]") //a/[font='Sign Up']
	WebElement signUpBtn;
	
	@FindBy (xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);		
	}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage login (String uName, String pwd){
		username.sendKeys(uName);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
	
}
