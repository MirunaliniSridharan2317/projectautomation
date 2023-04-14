package suites.User_selfservice;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.PO_Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import resources.Base;
import resources.RequiredMethods;

public class AddRequest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test(dataProvider = "getData")
	public void navigatToSite(String LeaveType) throws InterruptedException, IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		RequiredMethods met = new RequiredMethods();
		String[] process = met.randomDateGenerator();
		String sedt = process[0];
		String rtw = process[1];
		String user = prop.getProperty("user");
		String UserName1 = prop.getProperty("SS_User");
		String Password1 = prop.getProperty("SS_Password");
		String UserName2 = prop.getProperty("Super_User");
		String Password2 = prop.getProperty("SU_Password");
		if (user.equalsIgnoreCase("ssuser")) {
			PO_Login L = new PO_Login();
			L.getUserName().sendKeys(UserName1);
			L.getPassword().sendKeys(Password1);
			L.getLogin().click();
		} else if (user.equalsIgnoreCase("suuser")) {
			PO_Login L = new PO_Login();
			L.getUserName().sendKeys(UserName2);
			L.getPassword().sendKeys(Password2);
			L.getLogin().click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("AddLeave")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("datepicker")).sendKeys(sedt);
		driver.findElement(By.id("datepickerThrough")).sendKeys(sedt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("datepickerRTW")).sendKeys(rtw);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement element = driver.findElement(By.xpath(".//*[@id='leavereasonid']"));
		Select sel = new Select(element);
		sel.selectByVisibleText(LeaveType);
		driver.findElement(By.id("formSubmit")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("caseStatusAndType")).getText());
		Thread.sleep(3000);
		driver.quit();
	}

	// data provider to store the variable values which'll be used for the tests by
	// passing the output in the argument of the method
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][1];
		data[0][0] = "Birth of a child";
		data[1][0] = "Adoption of a child";
		data[2][0] = "Victim";
		return data;
	}

}
