package com.page.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class PO_HomePage extends Base {
	
	// Not in use
	
	By welcomeTitle=By.xpath("/html[1]/body[1]/div[3]/div[1]/span[1]/h1[1]"); 
	
	By homeTitle=By.xpath("//div/h1");
	
	public WebElement getwelcomeTitle()
	{
		return driver.findElement(welcomeTitle);
	}
	public WebElement gethomeTitle()
	{
		return driver.findElement(homeTitle);
	}
	


}
