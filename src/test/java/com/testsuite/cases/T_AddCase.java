package com.testsuite.cases;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.datamanager.Data_Properties;
import com.page.module.MTD_Common;
import com.page.module.LoginPage;
import com.page.locators.CasesPageLocators;
import com.page.locators.DashBoardPageLocators;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import com.base.Base;
import com.selenium.SafeActions;

public class T_AddCase extends SafeActions implements CasesPageLocators {
	private WebDriver driver;

	// Constructor to define/call methods
	 public T_AddCase(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}


	public static Logger log = LogManager.getLogger(Base.class.getName());
	Data_Properties P = new Data_Properties();
	//DashBoardPageLocators DP = new DashBoardPageLocators();

	@Test(groups = { "Site Admin", "Super Admin" }) 
	public void tc0001_ValidationAddCase() throws IOException, InterruptedException {
		// Login to the application
		//LoginPage loginPage = new LoginPage(driver); 
	//	loginPage.validateLogin(P.getValueFromPropFile("Super_User"), P.getValueFromPropFile("SU_Password"));
		chooseLeaveXpertMenuOption("Cases");
		//driver.findElement(ADDCASE).click();
		Thread.sleep(50);
		// Find the dropdown element and click on it to expand the options
	//	WebElement dropdown = driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/form[1]/div[6]/span[1]/span[1]/span[2]/span[1]"));

		// Click on the dropdown to expand the options
		//dropdown.click();

		// Find the option with the text "FML" and click on it
		//WebElement option = driver.findElement(By.xpath("//li[text()='FML']"));
		//option.click();
	
		
		
		//driver.findElement(ADDCASE).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		safeClearType(ENTEREMPLOYEE, "0004-Sharon Black", 0);
		pickValuesFromList(CASETYPEDROPDOWN, CASESTYPES, "ACC", 20);
		
		
	}

	
}
