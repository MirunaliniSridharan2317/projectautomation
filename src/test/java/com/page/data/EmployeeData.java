package com.page.data;

import org.testng.annotations.Test;

import com.datamanager.ConfigManager;

public class EmployeeData 
{
	private ConfigManager appData = new ConfigManager("App");
	public final String employeeNumber = appData.getProperty("App.EmployeeNumber");
	public final String employeeFirstName = appData.getProperty("App.EmployeeFirstName");
	public final String employeeLastName = appData.getProperty("App.EmployeeLastName");
	public final String employeeHireDate = appData.getProperty("App.EmployeeHireDate");
	public final String employeeWorkState = appData.getProperty("App.EmployeeWorkState");

	



}
