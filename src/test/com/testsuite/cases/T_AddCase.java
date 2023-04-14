package suites.User_others;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Data_Properties;
import pagemethods.MTD_Common;
import pagemethods.MTD_LoginPage;
import pageobjects.PO_Cases;
import pageobjects.PO_DashBoardPage;
import pageobjects.PO_Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import resources.Base;
import resources.RequiredMethods;
import resources.SafeActions;

public class T_AddCase extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	Data_Properties P = new Data_Properties();
	SafeActions A = new SafeActions();
	PO_DashBoardPage DP = new PO_DashBoardPage();
	PO_Cases C = new PO_Cases();

	@Test(groups = { "Site Admin", "Super Admin" })
	public void tc0001_ValidationAddCase() throws IOException {
		//Login to the application
		MTD_LoginPage loginPage = new MTD_LoginPage(driver);
		loginPage.validateLogin(P.getValueFromPropFile("Super_User"),P.getValueFromPropFile("SU_Password"));
		A.chooseLeaveXpertMenuOption("Cases");
		A.safeClickBtns(C.addCase(), 5);
		MTD_Common.validateHeader("Add Case", "Add Case");	
		A.safeClearType(C.enterEmployee(), "0004-Sharon Black", 0);
	}
	
	//waitTime(Integer.parseInt(P.getValueFromPropFile("shortWait")));
	// data provider to store the variable values which'll be used for the tests by
	// passing the output in the argument of the method
	/*@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][1];
		data[0][0] = "Birth of a child";
		data[1][0] = "Adoption of a child";
		data[2][0] = "Victim";
		return data;
	}
*/
}
