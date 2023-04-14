package suites.User_others;
import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import data.Data_Properties;
import pagemethods.MTD_LoginPage;
import resources.Base;
public class T_LoginPage extends Base {

	public static Logger log= LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	Data_Properties P = new Data_Properties();
		
	@Test( groups="Super Admin")

	public void tc0001_LoginToApplication() throws IOException	
	{
		MTD_LoginPage loginPage = new MTD_LoginPage(driver);
		loginPage.validateLogin(P.getValueFromPropFile("SS_User"), P.getValueFromPropFile("SS_Password"));
	}
	/*@DataProvider
	public Object[][] getData()
	{

		Object[][] data= new Object[2][2];
		//1st set 
		data[0][0]="FXOtest.employee@optis.com";
		data[0][1]="Qwerty2@";
		
		//2nd set
		data[1][0]= "ZenQA.LX.SuperUserRole@optis.com";
		data[1][1]= "Qwerty2@";

		return data;
		
	}*/
}