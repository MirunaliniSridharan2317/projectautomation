package com.page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public interface DashBoardPageLocators {

		By addrequest=By.id("AddLeave");
		By tablelength=By.className("dataTables_length");
		By searchbar=By.xpath("//label[text()='Search:']");
		By addleave=By.id("AddLeave");
		By email=By.id("email");
		By addnewcase=By.linkText("Add New Case");
		By addNewEmployee=By.linkText("Add New Employee");
		
		
		
}
