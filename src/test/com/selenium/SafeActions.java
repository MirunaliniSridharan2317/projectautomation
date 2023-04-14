package resources;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SafeActions extends Base {
	resources.Data_Properties P = new Data_Properties();

	public void safeClearType(WebElement locator, String input, int waitTime) {
		if (locator.isDisplayed()) {
			if (locator.isEnabled()) {
				waitTime(waitTime);
						locator.click();
				locator.clear();
				locator.sendKeys(input); 
			}
		}
	}
	public void chooseLeaveXpertMenuOption(String menuOption) throws NumberFormatException, IOException {
		Actions a1 = new Actions(driver);
		waitTime(Integer.parseInt(P.getValueFromPropFile("shortWait")));
		WebElement mainmenu1 = driver.findElement(By.linkText("LeaveXpert"));
		a1.moveToElement(mainmenu1).build().perform();
		WebElement Sub3 = driver.findElement(By.linkText(menuOption));
		Sub3.click();
	}
	
	public void safeClickBtns(WebElement inputBtnlocator, int waitTime) {
		waitTime(waitTime);
		if (inputBtnlocator.isDisplayed()) {
			if (inputBtnlocator.isEnabled()) {
				inputBtnlocator.click();
			}
		}
	}

}