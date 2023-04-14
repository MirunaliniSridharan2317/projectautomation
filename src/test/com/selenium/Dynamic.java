package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Dynamic extends Base
{
	/**
	 * Get dynamic locator resolved to normal one
	 * @param locator - locator that needs to be replaced
	 * @param dynamicText - text that is dynamic in the locator
	 * @return By - new locator after placing required text in the locator string
	 */
	
	public void MTD_LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	public static WebElement getNewLocator(By locator,String dynamicText)
	{
		
		WebElement newLocator = null;
		String locatorType = locator.toString().split(": ")[0].split("\\.")[1];
		String newLocatorString = String.format(locator.toString().split(": ")[1],dynamicText);
		System.out.println(newLocatorString);
		switch(locatorType)
		{
		case "xpath":
			locator = By.xpath(newLocatorString);
			 newLocator= driver.findElement(locator);
			System.out.println(newLocator);
			break;
			
		case "cssSelector":
			locator = By.cssSelector(newLocatorString);
			 newLocator= driver.findElement(locator);
			System.out.println(newLocator);
			break;
		case "id":
			locator = By.id(newLocatorString);
			 newLocator= driver.findElement(locator);
				System.out.println(newLocator);
			break;
		case "className":
			locator = By.className(newLocatorString);
			 newLocator= driver.findElement(locator);
				System.out.println(newLocator);
			break;
		case "name":
			locator = By.name(newLocatorString);
			 newLocator= driver.findElement(locator);
				System.out.println(newLocator);
			break;
		case "linkText":
			locator = By.linkText(newLocatorString);
			 newLocator= driver.findElement(locator);
				System.out.println(newLocator);
			break;
		case "partialLinkText":
			locator = By.partialLinkText(newLocatorString);
			 newLocator= driver.findElement(locator);
				System.out.println(newLocator);
			break;
		case "tagName":
			locator = By.tagName(newLocatorString);
			 newLocator= driver.findElement(locator);
				System.out.println(newLocator);
			break;
		}
		return newLocator;
	}
}
	