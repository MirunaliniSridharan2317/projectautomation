package com.page.data;


import com.datamanager.ConfigManager;

public class LoginData 
{
	private ConfigManager appData = new ConfigManager("App");
	public final String superUserName = appData.getProperty("App.superUserName");
	public final String superUserPassword = appData.getProperty("App.superUserPassword");


	



}
