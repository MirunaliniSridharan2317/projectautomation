package com.testsuite.cases;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.Base;
import com.datamanager.Data_Properties;
import com.page.data.EmployeeData;
import com.page.data.LoginData;
import org.openqa.selenium.WebDriver;
import com.page.module.DashBoardPage;
import com.page.module.EmployeesPage;
import com.page.module.LoginPage;
import com.selenium.SafeActions;
import com.page.locators.*; 

 //globally declaring instance variables 

public class Employees extends Base implements LoginPageLocators
{
	Data_Properties P = new Data_Properties();
	public static Logger log = LogManager.getLogger(Base.class.getName());
	EmployeeData employeeData = new EmployeeData();
	SafeActions SafeActions = new SafeActions();
	DashBoardPage DashBoardPage = new DashBoardPage();
	EmployeesPage EmployeesPage = new EmployeesPage();
	LoginPage LoginPage = new LoginPage();
	LoginData loginData = new LoginData();
	//WebDriver driver = initializeDriver();


	@Test
	public void tc0001_ValidationAddEmployee() throws NumberFormatException, IOException  {
	LoginPage.validateLogin(loginData.superUserName, loginData.superUserPassword);
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		/*SafeActions.chooseLeaveXpertMenuOption("Employees");
		
		DashBoardPage.clickAddEmployee();
		EmployeesPage.enterEmployeeNumber(employeeData.employeeNumber);

		EmployeesPage.enterEmployeeFirstName(employeeData.employeeFirstName);
		EmployeesPage.enterEmployeeLstName(employeeData.employeeLastName);
		EmployeesPage.enterEmployeeHireDate(employeeData.employeeHireDate);
		EmployeesPage.enterEmployeeWorkState(employeeData.employeeWorkState);
		EmployeesPage.createEmployee();*/
	}
}