package suites;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import resources.Base;
import resources.ExtentManager;

public class Listeners extends Base implements ITestListener{
	ExtentReports  extent=ExtentManager.getReportObject();
	@Override
	public void onTestStart(ITestResult result) {
		
		// TODO Auto-generated method stub
		ExtentTest test = extent.createTest("Initial Demo");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		WebDriver driver=null;
		String testMethodName=result.getMethod().getMethodName();
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) 
		{
		}
		try {
				getScreenShotPath(testMethodName,driver);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
}

	
	/*
	 * 
	 * common methods
	 * 		common to app
	 *		common to framework 
	 *			(common features within whole application, 
	 			create common tests in common page and just call it whenever it is required)
	 			location - cate to other folders - page objects
	 			folder for prop - and place all files in this folder- globally/ framework level 
	 * common methods(safe class files) - for click and call at required places (verification of state of the web elements)
	 method for login - use that method in loginpage.java
	 *groups - testng groups
	 *		by roles (data providers must to include)
	 *
	 *
	 *	// data provider to store the variable values which'll be used for the tests by
	// passing the output in the argument of the method
	 * 
	 * 	// to be noted
	// locators strategy  by id, name, classname, css selectors(xpath), xpath (only relative)
	//abs xpath is not advisable 
	 */
	/*
	 * method for login page here - diff mtds for diff users roles (based on cred)
	 * zeq framework
	 */
}
