package com.page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class PO_ProfilePage extends Base {
	

	public By changemyprofiletitle=By.className("k-window-title");
	public By changemyprofilebtnname=By.id("changeMyProfilePopupSave");

	
	public WebElement getProfileTitle()
	{
		return driver.findElement(changemyprofiletitle);
	}
	public WebElement getProfileBtnName()
	{
		return driver.findElement(changemyprofilebtnname);
	}



}
