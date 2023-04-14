package pagemethods;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;

import common.Required_Methods;
import pageobjects.PO_ProfilePage;
import resources.Base;

public class MTD_Common extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver; 
	static Required_Methods L = new Required_Methods();
	PO_ProfilePage PP = new PO_ProfilePage();
	
	
	public static void validateHeader(String header, String title) {
		Assert.assertEquals( L.getDialogTitle(header).getText(), title);
	}

	public void validateBtnName(String btnname) {
		Assert.assertEquals(PP.getProfileBtnName().getText(), btnname);
	}
}