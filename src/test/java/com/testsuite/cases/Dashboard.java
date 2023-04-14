package com.testsuite.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.datamanager.Data_Properties;
import com.page.module.MTD_Common;
import com.page.module.LoginPage;
import com.page.locators.DashBoardPageLocators;
import com.base.Base;
import com.selenium.SafeActions;

public class Dashboard {

	public static class T_LoginPage extends Base {
		public static Logger log = LogManager.getLogger(Base.class.getName());
		Data_Properties P = new Data_Properties(); 
		SafeActions A = new SafeActions(driver);
	//	com.page.locators.DashBoardPageLocators DP = new com.page.locators.DashBoardPageLocators();

		@Test(groups = { "Site Admin", "Super Admin" })
		public void tc0001_ValidationDashBoard() throws IOException {
			com.page.module.LoginPage loginPage = new com.page.module.LoginPage(driver);
			loginPage.validateLogin(P.getValueFromPropFile("Super_User"),P.getValueFromPropFile("SU_Password"));
			//MTD_DashBoardPage.verifyDashboardPage();
		//	DP.addLeave().click();
			//A.safeClearType(DP.email(), "test@gmail.com", 10);
			/*Actions a1 = new Actions(driver);
			waitTime(Integer.parseInt(P.getValueFromPropFile("shortWait")));
			WebElement mainmenu1 = driver.findElement(By.linkText("LeaveXpert"));
			a1.moveToElement(mainmenu1).build().perform();
			WebElement Sub3 = driver.findElement(By.linkText("Cases"));
			Sub3.click();		*/
			A.chooseLeaveXpertMenuOption("Cases");
			driver.findElement(By.linkText("Add New Case")).click();
			//validateHeader("Add Case");		
			//waitTime(Integer.parseInt(P.getValueFromPropFile("shortWait")));
			com.page.module.MTD_Common.validateHeader("Add Case", "Add Case");			
		}

		@Test
		public void tc0002_AddCase() throws IOException {
			
		}
	}

}
