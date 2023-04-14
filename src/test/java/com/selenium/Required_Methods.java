package com.selenium;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.Dynamic;
import com.page.module.LoginPage;
import com.page.locators.PO_Common;

public class Required_Methods {
	PO_Common C= new PO_Common();
	
	WebDriver driver;
	
	public WebElement getDialogTitle(String dynamicInput ) {
		
		WebElement locator = Dynamic.getNewLocator( C.dialogTitle, dynamicInput);
		
		return  locator;
		
	}

}
