package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resources.Base;

public class PO_DashBoardPage extends Base{

		By addrequest=By.id("AddLeave");
		By tablelength=By.className("dataTables_length");
		By searchbar=By.xpath("//label[text()='Search:']");
		By addleave=By.id("AddLeave");
		By email=By.id("email");
		By addnewcase=By.linkText("Add New Case");
		
		public WebElement buttonaddrequest()
		{
			return driver.findElement(addrequest);
		}
		public WebElement tablelength()
		{
			return driver.findElement(tablelength);
		}
		public WebElement searchbar()
		{
			return driver.findElement(searchbar);
		}
		public WebElement addnewcase()
		{
			return driver.findElement(addnewcase);
		}
		public WebElement email()
		{
			return driver.findElement(email);
		}
		
}
