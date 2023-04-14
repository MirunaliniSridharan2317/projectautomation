package pagemethods;

import java.io.IOException;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import data.Data_Properties;
import pageobjects.PO_HomePage;
import pageobjects.PO_Login;
import resources.Base;

public class MTD_LoginPage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	PO_Login L = new PO_Login();
	PO_HomePage H = new PO_HomePage();
	Data_Properties P = new Data_Properties();

	public MTD_LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	// To enter user name
	@Test
	public void enterUserName() throws IOException {
		L.getUserName().sendKeys(P.getValueFromPropFile("SS_User"));
	}

	// To enter password
	@Test
	public void enterPassword() throws IOException {
		L.getPassword().sendKeys(P.getValueFromPropFile("SS_Password"));
	}

	// To click on login button
	@Test
	public void submit() throws IOException {
		L.getLogin().click();
	}

// To click on login button
	@Test
	
	public MTD_DashBoardPage validateLogin(String username, String password) throws IOException {
		L.getUserName().sendKeys(username);
		L.getPassword().sendKeys(password);
		L.getLogin().click();
		return new MTD_DashBoardPage(driver);
	}
	
}
