package com.crm.qa.util;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 10;
	
	
//Explicit wait	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value){
		
		WebDriverWait driverwait = new WebDriverWait(driver, timeout);
		driverwait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	
	public static void clickOn(WebDriver driver, WebElement element, int timeout){
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
