package com.page.module;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import com.page.data.EmployeeData;
import com.page.locators.EmployeesPageLocators;
import com.page.locators.DashBoardPageLocators;
import com.selenium.SafeActions;
import com.base.Base;

public class EmployeesPage extends SafeActions implements EmployeesPageLocators {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;

	// Constructor to define/call methods
	 public EmployeesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


public EmployeesPage() {
		// TODO Auto-generated constructor stub
	}


@Test
	public  void enterEmployeeNumber(String empNum) throws IOException {
		//to enter employee number 
	safeClearType(ENTEREMPLOYEE,empNum,5);
}
public  void enterEmployeeFirstName(String empFstNme) throws IOException {
	//to enter employee number 
	safeClearType(FIRSTNAME,empFstNme,5);

}
public  void enterEmployeeLstName(String empLstNme) throws IOException {
	//to enter employee number 
	safeClearType(LASTNAME,empLstNme,5);
}
public  void enterEmployeeHireDate(String empHireDt) throws IOException {
	//to enter employee number 
	safeClearType(HIREDATE,empHireDt,5);
}
public  void enterEmployeeWorkState(String intTxt) {
	//to enter employee number 
	safeSelectOptionInDropDownByVisibleText(WORKSTATE,intTxt,5);
}

	public void createEmployee() {
		safeClickBtns(CREATEEMPLOYEE,0);
	}
	
	
	/*	boolean bIsTableLengthExists = 	P.tablelength().isDisplayed();
		boolean bIsSearchbarExists = P.searchbar().isDisplayed();
		boolean bIsButtonAddRequestExists = P.buttonaddrequest().isDisplayed();
		//System.out.print(bIsTableLengthExists);
		//System.out.print(bIsSearchbarExists);
		Assert.assertTrue(bIsTableLengthExists && bIsSearchbarExists && bIsButtonAddRequestExists);
		return null;
		}*/


}
