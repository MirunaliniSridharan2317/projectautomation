package pageobjects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	import resources.Base;

	public class PO_AddRequest extends Base {
		

		By username=By.id("UserName");
		By password=By.name("Password");
		By loginButton=By.className("validateAndSubmit");
		
		public WebElement getUserName()
		{
			return driver.findElement(username);
		}
		public WebElement getPassword()
		{
			return driver.findElement(password);
		}
		public WebElement getLogin()
		{
			return driver.findElement(loginButton);
		}

}
