package com.testsuite.selfserviceCases;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.locators.PO_HomePage;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import com.base.Base;

public class T_AddRequest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test(dataProvider = "getData")
	public void navigatToSite(String LeaveType) throws InterruptedException, IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		//RequiredMethods met = new RequiredMethods();
	//	String[] process = met.randomDateGenerator();	String sedt = process[0];
		String user = prop.getProperty("user");
		String UserName2 = prop.getProperty("Super_User");
		String Password2 = prop.getProperty("SU_Password");
		/*if (user.equalsIgnoreCase("suuser")) {
			PO_Login L = new PO_Login();
			L.getUserName().sendKeys(UserName2);
			L.getPassword().sendKeys(Password2);
			L.getLogin().click();
		}*/
		Actions a1 = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement mainmenu1 = driver.findElement(By.linkText("LeaveXpert"));
		a1.moveToElement(mainmenu1).build().perform();
		WebElement Sub3 = driver.findElement(By.linkText("Cases"));
		Thread.sleep(1000);
		Sub3.click();
		
		driver.findElement(By.linkText("Add New Case")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Employee")).sendKeys("0001");
		Thread.sleep(5000);

		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> options = driver.findElements(By.xpath("//li[contains(text(),'0001-Joe Nichols')]"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("0001"))
			{
				option.click();
				
			}
		}
		Thread.sleep(3000);*/
		//WebElement staticdropdown = driver.findElement(By.xpath("//input[@id='CaseTypes']"));
		//Select dropdown = new Select (staticdropdown);
		//dropdown.selectByVisibleText(LeaveType);		
		//driver.findElement(By.xpath("//input[@id='LoaEffectiveDate']")).sendKeys(sedt);
		//driver.findElement(By.className("k-update")).click();
		//driver.findElement(By.xpath("//div/button[@id='changeMyPasswordPopupSave']")).click();
	}
	// data provider to store the variable values which'll be used for the tests by
	// passing the output in the argument of the method
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][1];
		data[0][0] = "ACC";
		//data[1][0] = "MIL";
		//data[2][0] = "FML";
		return data;
	}
public void navigatToBrowser() throws IOException
	
	{
		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String user = prop.getProperty("user");
		String UserName1 = prop.getProperty("SS_User");
		String Password1 = prop.getProperty("SS_Password");
		String UserName2 = prop.getProperty("Super_User");
		String Password2= prop.getProperty("SU_Password");
		/*	if (user.equalsIgnoreCase("ssuser")) {
			PO_Login L = new PO_Login();
			PO_HomePage H = new PO_HomePage();
			Assert.assertEquals("Welcome to Optis!", H.getwelcomeTitle().getText());
			L.getUserName().sendKeys(UserName1);
			L.getPassword().sendKeys(Password1);
			L.getLogin().click();
		} else if (user.equalsIgnoreCase("suuser")) {
			PO_Login L = new PO_Login();
			PO_HomePage H = new PO_HomePage();
			Assert.assertEquals("Welcome to Optis!", H.getwelcomeTitle().getText());
			L.getUserName().sendKeys(UserName2);
			L.getPassword().sendKeys(Password2);
			L.getLogin().click();
		}*/
	}

}
