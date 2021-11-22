package sdfc_tests;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sdfc_pages.LoginPage;
import sdfc_pages.UserMenuPage;
import sdfc_utilities.Data_Utilities;
import sdfc_utilities.Listener_Utilities;



@Listeners(Listener_Utilities.class)
public class UserMenu_test extends Base_test{
	
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
	public void finishtest() 
	{
		
		au.logoutApp();
	}
	
	
@Test(priority = 5)
	public void loginTC05() throws IOException, InterruptedException {
		
		
		System.out.println("TC05");
		logger.info("TC_05 is Started");
		au.loginApp();
		Thread.sleep(3000);
		bu.isElementVisible(LoginPage.hometab);
		bu.waitForElement(UserMenuPage.usermenu_dropdown, driver);
		bu.clickOnElement(UserMenuPage.usermenu_dropdown);
		bu.isElementVisible(UserMenuPage.usermenu_dropdown);
	}

@Test(priority = 6)
public void loginTC06() throws IOException, InterruptedException {
	
	
	System.out.println("TC06");
	logger.info("TC_06 is Started");
	au.loginApp();
	Thread.sleep(3000);
	bu.isElementVisible(LoginPage.hometab);
	bu.clickOnElement(UserMenuPage.usermenu_dropdown);
	bu.clickOnElement(UserMenuPage.usermenu_dropdown_MyProfile);
	bu.waitForElement(UserMenuPage.editbutton, driver);
	bu.clickOnElement(UserMenuPage.editbutton);
	driver.switchTo().frame(UserMenuPage.switch_Iframe);
	bu.clickOnElement(UserMenuPage.aboutTab);
	bu.waitForElement(UserMenuPage.lastName, driver);
	bu.clearText(UserMenuPage.lastName);
	bu.sendText(UserMenuPage.lastName, du.readAccountsProperties("prod.user.lastName"));
	bu.clickOnElement(UserMenuPage.save_all);
	bu.clickOnElement(UserMenuPage.post_button);
	bu.isElementVisible(UserMenuPage.switch_Iframe1);
	driver.switchTo().frame(UserMenuPage.switch_Iframe1);
	bu.sendText(UserMenuPage.postMessage, du.readAccountsProperties("prod.user.postMessage"));
	bu.waitForElement(UserMenuPage.clickshare_button, driver);
	bu.isElementVisible(UserMenuPage.clickshare_button);
	bu.clickOnElement(UserMenuPage.clickshare_button);
	bu.isElementVisible(UserMenuPage.filetab);
	bu.clickOnElement(UserMenuPage.filetab);
	bu.clickOnElement(UserMenuPage.uploadfile_computer);
	bu.sendText(UserMenuPage.choosefile_computer, "C://Users//Sangeetha//OneDrive - YouthInU//Desktop//Assignments//TestCase_06(Files)");
	bu.clickOnElement(UserMenuPage.publishsharebutton);
	bu.clickOnElement(UserMenuPage.add_profilephoto);
	bu.isElementVisible(UserMenuPage.switch_Iframe2);
	driver.switchTo().frame(UserMenuPage.switch_Iframe2);
	bu.clickOnElement(UserMenuPage.clickphoto_choosefile);
	bu.sendText(UserMenuPage.clickphoto_choosefile, du.readAccountsProperties("sChoosePhotoPathTC06"));
	bu.clickOnElement(UserMenuPage.savephoto);
	bu.clickOnElement(UserMenuPage.save_cropPhoto);
	
	}


@Test(priority = 7)
public void loginTC07() throws IOException, InterruptedException {

	System.out.println("TC07");
	logger.info("TC_07 is Started");
	au.loginApp();
	bu.clickOnElement(UserMenuPage.usermenu_dropdown);
	bu.clickOnElement(UserMenuPage.Mysettings);
	bu.clickOnElement(UserMenuPage.click_personalinfo);
	bu.isElementVisible(UserMenuPage.click_Loginhistory);
	bu.clickOnElement(UserMenuPage.click_Loginhistory);
	bu.clickOnElement(UserMenuPage.download_login_history);
	bu.clickOnElement(UserMenuPage.click_display_Layout);
	bu.clickOnElement(UserMenuPage.click_customizetab);
	bu.waitForElement(UserMenuPage.salesforcechatter, driver);
	bu.clickOnElement(UserMenuPage.salesforcechatter);
	bu.isElementSelected(UserMenuPage.Reportstab);
	bu.clickOnElement(UserMenuPage.click_add);
	bu.clickOnElement(UserMenuPage.save_reporttab);
	bu.clickOnElement(UserMenuPage.email_tab);
	bu.clickOnElement(UserMenuPage.email_settings);
	bu.waitForElement(UserMenuPage.send_name, driver);
	bu.clickOnElement(UserMenuPage.send_name);
	bu.clearText(UserMenuPage.send_name);
	bu.sendText(UserMenuPage.send_name, du.readAccountsProperties("prod.send_name"));
	bu.waitForElement(UserMenuPage.send_email, driver);
	bu.clickOnElement(UserMenuPage.send_email);
	bu.clearText(UserMenuPage.send_email);
	bu.sendText(UserMenuPage.send_email, du.readAccountsProperties("prod.send_email"));
	bu.isElementSelected(UserMenuPage.auto_click);
	bu.clickOnElement(UserMenuPage.auto_click);
	Thread.sleep(3000);
	bu.waitForElement(UserMenuPage.email_Save, driver);
	//bu.clickOnElement(UserMenuPage.email_Save);
	bu.isElementVisible(UserMenuPage.email_Save);
	bu.clickOnElement(UserMenuPage.email_Save);
	bu.waitForElement(UserMenuPage.tab_settings, driver);
	bu.clickOnElement(UserMenuPage.tab_settings);
	bu.clickOnElement(UserMenuPage.calendermind_click);
	bu.waitForElement(UserMenuPage.activityremind, driver);
	bu.clickOnElement(UserMenuPage.activityremind);
	bu.waitForElement(UserMenuPage.testremind_click, driver);
	bu.clickOnElement(UserMenuPage.testremind_click);
	
	
	
}

@Test(priority =8)
public void loginTC08() throws IOException, InterruptedException {
	
	
	System.out.println("TC08");
	logger.info("TC_08 is Started");
	au.loginApp();
	bu.clickOnElement(UserMenuPage.usermenu_dropdown);
	bu.clickOnElement(UserMenuPage.Developer_console);
	driver.switchTo().frame(0);
	driver.close();
	driver.quit();
	
}

@Test(priority = 9)
public void loginTC09() throws IOException, InterruptedException {
	
	
	System.out.println("TC09");
	logger.info("TC_09 is Started");
	au.loginApp();
	bu.clickOnElement(UserMenuPage.usermenu_dropdown);
	bu.clickOnElement(UserMenuPage.click_logout);
}

}