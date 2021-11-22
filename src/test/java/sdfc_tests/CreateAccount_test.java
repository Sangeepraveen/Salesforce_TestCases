package sdfc_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sdfc_pages.CreateAccountPage;
import sdfc_utilities.Data_Utilities;
import sdfc_utilities.Listener_Utilities;


@Listeners(Listener_Utilities.class)
public class CreateAccount_test extends Base_test{
	
	
	Data_Utilities du = new Data_Utilities();
		
	@BeforeSuite
	public void setUp() throws IOException
	{
		au.setUp();
	}
	
	@BeforeMethod
	public void launchApp() throws IOException, InterruptedException
	{
		au.url();
	}
	
	@AfterSuite
	public void finishtest() {
		
		au.logoutApp();
	}
	
	@Test(priority = 10)
	public void loginTC_10() throws IOException, InterruptedException {
		
		System.out.println("TC10");
		logger.info("TC_10 is Started");
		au.loginApp();
		bu.waitForElement(CreateAccountPage.Account_tab, driver);
		bu.clickOnElement(CreateAccountPage.Account_tab);
		bu.waitForElement(CreateAccountPage.close_ad, driver);
		bu.clickOnElement(CreateAccountPage.close_ad);
		bu.clickOnElement(CreateAccountPage.newbutton);
		bu.waitForElement(CreateAccountPage.acc_name, driver);
		bu.clearText(CreateAccountPage.acc_name);
		bu.sendText(CreateAccountPage.acc_name, du.readAccountsProperties("prod.account_name"));
		bu.clickOnElement(CreateAccountPage.acc_type);
		bu.clickOnElement(CreateAccountPage.acc_priority);
		bu.clickOnElement(CreateAccountPage.click_save);
	}
	
	@Test(priority = 11)
	public void loginTC_11() throws IOException, InterruptedException {
		
		System.out.println("TC11");
		logger.info("TC_11 is Started");
		au.loginApp();
		bu.clickOnElement(CreateAccountPage.Account_tab);
		bu.waitForElement(CreateAccountPage.close_ad, driver);
		bu.clickOnElement(CreateAccountPage.close_ad);
		bu.clickOnElement(CreateAccountPage.create_Newview);
		bu.waitForElement(CreateAccountPage.view_name, driver);
		bu.sendText(CreateAccountPage.view_name, du.readAccountsProperties("prod.view_name"));
		bu.sendText(CreateAccountPage.view_uniquename, du.readAccountsProperties("prod.view_uniquename"));
		bu.clickOnElement(CreateAccountPage.save_NewView);
	}
	
	@Test(priority = 12)
	public void loginTC_12() throws IOException, InterruptedException {
		
		System.out.println("TC12");
		logger.info("TC_12 is Started");
		au.loginApp();
		bu.clickOnElement(CreateAccountPage.Account_tab);
		bu.waitForElement(CreateAccountPage.close_ad, driver);
		bu.clickOnElement(CreateAccountPage.close_ad);
		bu.clickOnElement(CreateAccountPage.click_editbutton);
		bu.waitForElement(CreateAccountPage.edit_viewname, driver);
		bu.clearText(CreateAccountPage.edit_viewname);
		bu.sendText(CreateAccountPage.edit_viewname, du.readAccountsProperties("prod.New_View_name"));
		bu.clearText(CreateAccountPage.edit_uniquename);
		bu.sendText(CreateAccountPage.edit_uniquename, du.readAccountsProperties("prod.New_View_Unique_name"));
		bu.clickOnElement(CreateAccountPage.Filter_Field);
		bu.clickOnElement(CreateAccountPage.Filter_Operator);
		bu.sendText(CreateAccountPage.Filter_Contains, du.readAccountsProperties("prod.Filter_contains"));
		bu.isElementSelected(CreateAccountPage.select_Lastactivity);
		bu.clickOnElement(CreateAccountPage.add);
		bu.clickOnElement(CreateAccountPage.save_Edit);
		//bu.waitForElement(CreateAccountPage.save_Edit, driver);
		
	}
	
	@Test(priority = 13)
	public void loginTC_13() throws IOException, InterruptedException {
		
		System.out.println("TC13");
		logger.info("TC_13 is Started");
		au.loginApp();
		bu.clickOnElement(CreateAccountPage.Account_tab);
		bu.waitForElement(CreateAccountPage.close_ad, driver);
		bu.clickOnElement(CreateAccountPage.close_ad);
		bu.clickOnElement(CreateAccountPage.Merge_account);
		bu.clickOnElement(CreateAccountPage.name_mergerecords);
		bu.sendText(CreateAccountPage.name_mergerecords, du.readAccountsProperties("prod.Merge_records_Name"));
		bu.clickOnElement(CreateAccountPage.click_findaccounts);
		bu.clickOnElement(CreateAccountPage.click_next);
		bu.clickOnElement(CreateAccountPage.click_merge_button);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		
		
	
}
	
	@Test(priority = 14)
	public void loginTC_14() throws IOException, InterruptedException, AWTException {
		
		System.out.println("TC14");
		logger.info("TC_14 is Started");
		au.loginApp();
		bu.clickOnElement(CreateAccountPage.Account_tab);
		bu.waitForElement(CreateAccountPage.close_ad, driver);
		bu.clickOnElement(CreateAccountPage.close_ad);
		bu.clickOnElement(CreateAccountPage.Acc_last_activity);
		bu.clickOnElement(CreateAccountPage.datefield);
		Thread.sleep(2000);
		Robot rbdate=new Robot();
		rbdate.keyPress(KeyEvent.VK_DOWN);
		rbdate.keyRelease(KeyEvent.VK_DOWN);
		rbdate.keyPress(KeyEvent.VK_ENTER);
		rbdate.keyRelease(KeyEvent.VK_ENTER);
		bu.clickOnElement(CreateAccountPage.from_date);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		Robot rbfrom=new Robot();
		rbfrom.keyPress(KeyEvent.VK_CONTROL);
		rbfrom.keyPress(KeyEvent.VK_SPACE);
		rbfrom.keyRelease(KeyEvent.VK_SPACE);
		rbfrom.keyRelease(KeyEvent.VK_CONTROL);
		bu.clickOnElement(CreateAccountPage.to_date);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		rbfrom.keyPress(KeyEvent.VK_CONTROL);
		rbfrom.keyPress(KeyEvent.VK_SPACE);
		rbfrom.keyRelease(KeyEvent.VK_SPACE);
		rbfrom.keyRelease(KeyEvent.VK_CONTROL);
		bu.clickOnElement(CreateAccountPage.save_lastactivity);
		bu.sendText(CreateAccountPage.Report_name, du.readAccountsProperties("prod.Report_name"));
		bu.sendText(CreateAccountPage.Report_Uniquename, du.readAccountsProperties("prod.Report_uniquename"));
		bu.clickOnElement(CreateAccountPage.save_Report);
		}
}