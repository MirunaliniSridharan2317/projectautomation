package com.page.module;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import com.page.locators.DashBoardPageLocators;
import com.selenium.SafeActions;
import com.base.Base;

public class DashBoardPage extends SafeActions implements DashBoardPageLocators {
	public WebDriver driver;

	// Constructor to define/call methods
	 public DashBoardPage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	public DashBoardPage() {
		// TODO Auto-generated constructor stub
	}

	public static Logger log = LogManager.getLogger(Base.class.getName());


@Test
	/*public static DashBoardPage verifyDashboardPage() {
		boolean bIsTableLengthExists = 	P.tablelength().isDisplayed();
		boolean bIsSearchbarExists = P.searchbar().isDisplayed();
		boolean bIsButtonAddRequestExists = P.buttonaddrequest().isDisplayed();
		//System.out.print(bIsTableLengthExists);
		//System.out.print(bIsSearchbarExists);
		Assert.assertTrue(bIsTableLengthExists && bIsSearchbarExists && bIsButtonAddRequestExists);
		return null;
		}*/
public  void clickAddEmployee() {
	safeClickBtns(addNewEmployee,5);
}


}
