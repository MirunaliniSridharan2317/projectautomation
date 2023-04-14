package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.Base;
import com.utilities.TimeOuts;
public class Sync extends Base implements TimeOuts {
	protected Logger log = LogManager.getLogger("Sync");
	   WebDriver driver;
	   public Sync(WebDriver driver)
	   {
	     this.driver = driver;
	   }

	String getTestCasename()
	{

		int len= Thread.currentThread().getStackTrace().length;
		String testCaseName = "null";
		for(int tcName=0;tcName<=len;tcName++)
		{
			if(Thread.currentThread().getStackTrace()[tcName].getMethodName().contains("invoke"))
			{
				testCaseName = Thread.currentThread().getStackTrace()[tcName-1].getMethodName();
				break;
			}


		}
		return testCaseName+":";

	}


	protected int getWaitTime(int optionWaitTime) {
	    int waitTime;
	    switch (optionWaitTime) {
	        case 1:
	            waitTime = 5;
	            break;
	        case 2:
	            waitTime = 10;
	            break;
	        case 3:
	            waitTime = 15;
	            break;
	        default:
	            waitTime = 5;
	    }
	    return waitTime;
	}

	protected boolean isElementPresent(By locator, int waitTime)
	{
	    boolean bFlag = false;
	    try
	    {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
	        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	        if(driver.findElement(locator).isDisplayed() || driver.findElement(locator).isEnabled())
	        {
	            bFlag = true;
	            //log.info(getTestCasename()+"Element " + locator + " is displayed");
	        }
	    }
	    catch (NoSuchElementException e)
	    {
	        log.info(getTestCasename()+"Element " + locator + " was not found in DOM in time - "+waitTime+" Seconds - NoSuchElementException");
	    }
	    catch (TimeoutException e)
	    {
	        log.info(getTestCasename()+"Element " + locator + " was not displayed in time - "+waitTime+" Seconds"+" - TimeoutException");
	    }
	    catch (Exception e)
	    {
	        log.error(getTestCasename()+"Element " + locator + " is not found - " + e);
	        //Assert.fail("Element " + locator + " is not displayed");
	    }
	    return bFlag;
	}


}
