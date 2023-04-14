package com.page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public interface CasesPageLocators {
	

	By ADDCASE=By.linkText("Add New Case");
	By ENTEREMPLOYEE=By.name("Employee");
	By CREATECASE=By.linkText("Create");
	By CASETYPEDROPDOWN=By.xpath("//span[@id='CaseTypes-list']//span[@class='k-icon k-i-arrow-s']");
	By CASESTYPES=By.xpath("//span[contains(text(),'ACC')]");
	By LEAVEREASON=By.linkText("Create");
	By EFFECTIVEDATE=By.linkText("Create");
	
	

}
