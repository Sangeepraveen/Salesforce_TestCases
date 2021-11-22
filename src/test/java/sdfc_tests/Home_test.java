package sdfc_tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import sdfc_pages.LoginPage;
import sdfc_pages.UserMenuPage;
import sdfc_utilities.Data_Utilities;

public class Home_test extends Base_test {
	
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
}


