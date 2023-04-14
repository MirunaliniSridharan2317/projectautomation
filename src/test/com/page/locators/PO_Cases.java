package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class PO_Cases extends Base {
	

	By addCase=By.linkText("Add New Case");
	By enterEmployee=By.name("Employee");
	By createCase=By.linkText("Create");
	
	public WebElement addCase()
	{
		return driver.findElement(addCase);
	}
	public WebElement enterEmployee()
	{
		return driver.findElement(enterEmployee);
	}
	public WebElement getLogin()
	{
		return driver.findElement(createCase);
	}


}
