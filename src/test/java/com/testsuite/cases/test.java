package com.testsuite.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamanager.ConfigManager;
import com.page.data.EmployeeData;
import com.page.data.LoginData;

public class test {
	private EmployeeData EmployeeTestData;
	@Test
	public void baseClassSetUp() {
		LoginData loginData = new LoginData();
		System.out.println(loginData.superUserName);
	    Assert.assertNotNull(loginData.superUserName, "Employee number should not be null");
	    Assert.assertNotEquals("", loginData.superUserName.trim(), "Employee number should not be empty");
	}
	
	@Test
	public void test() {
		ConfigManager configManager = new ConfigManager("App");
		System.out.println(configManager.getProperty("App.EmployeeNumber"));
	}
}