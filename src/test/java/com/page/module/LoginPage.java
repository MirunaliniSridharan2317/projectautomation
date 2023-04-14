package com.page.module;

import java.io.IOException;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import com.page.locators.LoginPageLocators;
import com.selenium.SafeActions;
import com.base.Base;

public class LoginPage extends SafeActions implements LoginPageLocators { 
	public WebDriver driver;

	// Constructor to define/call methods
	 public LoginPage(WebDriver driver) {
		super(driver);
	}


	public LoginPage() {
		// TODO Auto-generated constructor stub
	}


	public static Logger log = LogManager.getLogger(Base.class.getName());



	// To enter user name
	@Test
	public void enterUserName(String usrNme) throws IOException {
		safeClearType(USERNAME,usrNme, 0);
	}

	// To enter password
	@Test
	public void enterPassword(String pwd) throws IOException {
		safeClearType(PASSWORD,pwd, 0);
	}

	// To click on login button
	@Test
	public void submit() throws IOException {
		safeClickBtns(LOGINBTN,0);
	}

// To click on login button
	@Test
	
	public void validateLogin(String usrNme, String pwd) throws IOException {
		safeClearType(USERNAME,usrNme, 0);
		safeClearType(PASSWORD,pwd, 0);
		safeClickBtns(LOGINBTN,0);
		
	}
	
}
