package suites.User_others;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import data.Data_Properties;
import pagemethods.MTD_Common;
import pagemethods.MTD_LoginPage;
import pageobjects.PO_DashBoardPage;
import resources.Base;
import resources.SafeActions;

public class T_DashboardPage {

	public static class T_LoginPage extends Base {
		public static Logger log = LogManager.getLogger(Base.class.getName());
		Data_Properties P = new Data_Properties();
		SafeActions A = new SafeActions();
		PO_DashBoardPage DP = new PO_DashBoardPage();

		@Test(groups = { "Site Admin", "Super Admin" })
		public void tc0001_ValidationDashBoard() throws IOException {
			MTD_LoginPage loginPage = new MTD_LoginPage(driver);
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
			waitTime(Integer.parseInt(P.getValueFromPropFile("shortWait")));
			MTD_Common.validateHeader("Add Case", "Add Case");			
		}

	/*	@Test(groups = "Super Admin")
		public void tc0002_AddCase() throws IOException {
			MTD_LoginPage loginPage = new MTD_LoginPage(driver);
			loginPage.validateLogin(P.getValueFromPropFile("SS_User"),P.getValueFromPropFile("SS_Password"));
			DP.addLeave().click();
			A.safeClearType(DP.email(), "test@gmail.com", 10);
		}*/
	}

}
