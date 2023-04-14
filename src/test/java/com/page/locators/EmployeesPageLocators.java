package com.page.locators;

import org.openqa.selenium.By;


public interface EmployeesPageLocators {
	

	By ADDEMPLOYEE=By.linkText("Add New Employee");
	By ENTEREMPLOYEE=By.cssSelector("#EmployeeNumber");
	By FIRSTNAME=By.id("FirstName");
	By LASTNAME=By.id("LastName");
	By HIREDATE=By.id("HireDate");
	By WORKSTATE=By.xpath("//span[contains(text(),'Select An Option')]");
	By WORKSTATELIST =By.xpath("//li[contains(text(),'Alaska')]");
	By CREATEEMPLOYEE=By.linkText("Create");
	
	

}
