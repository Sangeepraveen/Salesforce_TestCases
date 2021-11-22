package sdfc_utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import sdfc_tests.Base_test;

public class Listener_Utilities extends Base_test implements ITestListener{

	//ExtentTest test;
	//Basic_Utilities bu = new Basic_Utilities();
	//WebDriver driver;
	
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result) {
		try {
			test.log(Status.FAIL, result.getName() + "Error").addScreenCaptureFromPath(bu.getScreenCapture(driver));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestStart(ITestResult result) {
		
		
		test = extent.createTest(result.getName());
		
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		test.log(Status.PASS, result.getName());
	}
	
}
