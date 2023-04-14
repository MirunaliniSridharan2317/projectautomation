package com.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base  {
	public  WebDriver driver;
	public Properties prop;
	


	@BeforeMethod (groups={"Site Admin", "Super Admin"})
	public WebDriver initializeDriver() throws IOException { 
		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\ConfigFiles\\App.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String driverPath =System.getProperty("user.dir") +
				"\\Resource\\Drivers";
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");
			 driver = new ChromeDriver();
			launchUrl();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", driverPath + "\\msedgedriver.exe");
			driver = new EdgeDriver();
			launchUrl();
		}
		// return driver;
		return driver;
	}

	public void launchUrl() {
		driver.get(prop.getProperty("URL"));
	}
	


	public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(Source, new File(destinationFile));
	}

	@AfterMethod (groups={"Site Admin", "Super Admin"})
	public void quitBrowser() throws IOException {
		driver.quit();
	}
}