package pagemethods;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import pageobjects.PO_DashBoardPage;
import resources.Base;

public class MTD_DashBoardPage  {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	static PO_DashBoardPage P = new PO_DashBoardPage();

	
	public MTD_DashBoardPage(WebDriver driver)
	{
		super ();
		this.driver=driver;
	}
@Test
	public static MTD_DashBoardPage verifyDashboardPage() {
		boolean bIsTableLengthExists = 	P.tablelength().isDisplayed();
		boolean bIsSearchbarExists = P.searchbar().isDisplayed();
		boolean bIsButtonAddRequestExists = P.buttonaddrequest().isDisplayed();
		//System.out.print(bIsTableLengthExists);
		//System.out.print(bIsSearchbarExists);
		Assert.assertTrue(bIsTableLengthExists && bIsSearchbarExists && bIsButtonAddRequestExists);
		return null;
		}


}
