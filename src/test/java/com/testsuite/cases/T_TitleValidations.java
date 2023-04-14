package com.testsuite.cases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.datamanager.Data_Properties;
import com.page.locators.PO_HomePage;
import com.base.Base;
public class T_TitleValidations extends Base{
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(T_TitleValidations.class.getName());
	public Properties prop = new Properties();
	String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\App.properties";
	/*@BeforeTest
	public void initialize() throws IOException
	{ 
		log.info("Driver is Initialized");
		driver.get(prop.getProperty("URL"));
		log.info("Navigated to the Site");
	}*/
	@Test
	public void validateWelcomeTitle() throws IOException
	{

		PO_HomePage H = new PO_HomePage();
		System.out.println(H.getwelcomeTitle().getText());
		Assert.assertEquals("Welcome to Optis!", H.getwelcomeTitle().getText());
	}	
	@Test
	public void validateHomeTitle() throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		//PO_Login L = new PO_Login();
		PO_HomePage H = new PO_HomePage();
		Data_Properties P = new Data_Properties();
	//	L.getUserName().sendKeys(P.getValueFromPropFile("SS_User"));
	//	L.getPassword().sendKeys(P.getValueFromPropFile("SS_Password"));
	//	L.getLogin().click();
		log.info("Successfully LoggedIn");
		System.out.println(H.gethomeTitle().getText());
		Assert.assertEquals("SELF SERVICE", H.gethomeTitle().getText());
	}	
}
