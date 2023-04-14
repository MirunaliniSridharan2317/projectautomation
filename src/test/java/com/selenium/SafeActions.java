package com.selenium;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.Base;
import com.datamanager.ConfigManager;
import com.datamanager.Data_Properties;


public class SafeActions extends Base {
	

	public SafeActions(WebDriver driver) {
		super();
		this.driver = driver;
	}
		public SafeActions() {
		// TODO Auto-generated constructor stub
	}
	Data_Properties P = new Data_Properties();
	private ConfigManager sys = new ConfigManager();

	public void safeClearType(By locator, String input, int waitTime) throws IOException {
		
		WebElement inputBtn = driver.findElement(locator);
		if (inputBtn.isDisplayed()) {
			if (inputBtn.isEnabled()) {
				waitTime(waitTime);
				inputBtn.click();
				inputBtn.clear();
				inputBtn.sendKeys(input);
			}
		}
		//driver.quit();
	}

	public void chooseLeaveXpertMenuOption(String menuOption) throws NumberFormatException, IOException {
		Actions a1 = new Actions(driver);
		waitTime(Integer.parseInt(P.getValueFromPropFile("shortWait")));
		WebElement mainmenu1 = driver.findElement(By.linkText("LeaveXpert"));
		a1.moveToElement(mainmenu1).build().perform();
		WebElement Sub3 = driver.findElement(By.linkText(menuOption));
		Sub3.click();
	}

	public void safeClickBtns(By inputBtnLocator, int waitTime) {
		waitTime(waitTime);
		WebElement inputBtn = driver.findElement(inputBtnLocator);
		if (inputBtn.isDisplayed()) {
			if (inputBtn.isEnabled()) {
				inputBtn.click();
			}
		}
	}

	public void waitTime(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public void selectDropdownOption(By dropdownLocator, String optionValue, int timeoutSeconds) {
		WebElement dropdownElement = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
				.until(ExpectedConditions.elementToBeClickable(dropdownLocator));

		Select dropdown = new Select(dropdownElement);
		dropdown.selectByValue(optionValue);
	}

	public void pickValuesFromDropdown(By dropDown, By valuesList, String value, int waitTime) {
		waitTime(waitTime);
		int maxTries = 5;
		int numTries = 0;
		while (numTries < maxTries) {
			try {
				WebElement dropdown = driver.findElement(dropDown);
				List<WebElement> options = dropdown.findElements(valuesList);
				String desiredValue = value;
				for (WebElement option : options) {
					if (option.getText().equals(desiredValue)) {
						option.click();
						break;
					}
				}
				break;
			} catch (StaleElementReferenceException e) {
				numTries++;
			}
		}
	}

	public void pickValuesFromList(By dropDown, By valuesList, String input, int waitTime) {
		waitTime(waitTime);
		driver.findElement(dropDown).click();

		// Find all the values in the list
		List<WebElement> values = driver.findElements(valuesList);

		// Loop through the values and click on the desired value
		String desiredValue = input; // Replace with the desired value
		for (WebElement value : values) {
			if (value.getText().equals(desiredValue)) {
				value.click();
				break;
			}
		}
	}

	public void safeSelectOptionInDropDownByVisibleText(By locator, String inputText, int waitTime) {
		WebElement staticdropdown = driver.findElement(locator);
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(inputText);

	}

	

}