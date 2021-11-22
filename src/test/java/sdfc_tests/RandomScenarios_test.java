package sdfc_tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sdfc_pages.ContactsPage;
import sdfc_pages.RandomScenariosPage;
import sdfc_pages.UserMenuPage;
import sdfc_utilities.Data_Utilities;
import sdfc_utilities.Listener_Utilities;

@Listeners(Listener_Utilities.class)
public class RandomScenarios_test extends Base_test{
			
		Data_Utilities du = new Data_Utilities();
		RandomScenariosPage rsp = new RandomScenariosPage(null);
		
		@BeforeSuite
		public void setUp() throws IOException 
		{
			au.setUp();
		}
		
		@BeforeMethod
		public void launchApp() {
			au.url();

		}
		
		@AfterSuite
		public void finishtest() {
			au.logoutApp();
		}
		
		@Test(priority = 33)
		public void loginTC_33() throws IOException, InterruptedException {
			
			System.out.println("TC33");
			logger.info("TC_33 is Started");
			au.loginApp();
			bu.clickOnElement(RandomScenariosPage.Home_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.waitForElement(RandomScenariosPage.profile_name, driver);
			bu.clickOnElement(RandomScenariosPage.profile_name);
		}
		
		@Test(priority = 34)
		public void loginTC_34() throws IOException, InterruptedException {
			
			System.out.println("TC34");
			logger.info("TC_34 is Started");
			au.loginApp();
			bu.clickOnElement(RandomScenariosPage.Home_tab);
			bu.waitForElement(RandomScenariosPage.close_ad, driver);
			bu.clickOnElement(RandomScenariosPage.close_ad);
			bu.waitForElement(RandomScenariosPage.profile_name, driver);
			bu.clickOnElement(RandomScenariosPage.profile_name);
			bu.waitForElement(RandomScenariosPage.editbutton, driver);
			bu.clickOnElement(RandomScenariosPage.editbutton);
			driver.switchTo().frame(RandomScenariosPage.switch_Iframe);
			bu.clickOnElement(RandomScenariosPage.aboutTab);
			bu.clickOnElement(RandomScenariosPage.last_Name);
			bu.clearText(RandomScenariosPage.last_Name);
			bu.sendText(RandomScenariosPage.last_Name, du.readAccountsProperties("prod.RandomScenario_lName"));
			bu.clickOnElement(RandomScenariosPage.click_saveall);
		}
		
		@Test(priority = 35)
		public void loginTC_35() throws IOException, InterruptedException {
			
			System.out.println("TC35");
			logger.info("TC_35 is Started");
			au.loginApp();
			bu.clickOnElement(RandomScenariosPage.alltabs);
			bu.clickOnElement(RandomScenariosPage.customize_tabs);
			bu.waitForElement(RandomScenariosPage.select_tab, driver);
			bu.isElementSelected(RandomScenariosPage.select_tab);
			//bu.clickOnElement(RandomScenariosPage.select_tab);
			bu.clickOnElement(RandomScenariosPage.remove_icon);
			bu.clickOnElement(UserMenuPage.usermenu_dropdown);
			bu.isElementVisible(UserMenuPage.usermenu_dropdown);
			bu.clickOnElement(UserMenuPage.click_logout);
		}
		
		@Test(priority = 36)
		public void loginTC_36() throws IOException, InterruptedException, AWTException {
			
			System.out.println("TC36");
			logger.info("TC_36 is Started");
			au.loginApp();
			bu.clickOnElement(RandomScenariosPage.Home_tab);
			bu.waitForElement(RandomScenariosPage.close_ad, driver);
			bu.clickOnElement(RandomScenariosPage.close_ad);
			bu.clickOnElement(RandomScenariosPage.click_currentdate);
			bu.clickOnElement(RandomScenariosPage.click_time8pm);
			bu.clickOnElement(RandomScenariosPage.combobox_Icon);
			driver.switchTo().frame(RandomScenariosPage.Iframe);
			bu.isElementVisible(RandomScenariosPage.click_Others_combobox);
			bu.clickOnElement(RandomScenariosPage.click_Others_combobox);
			bu.clickOnElement(RandomScenariosPage.enddate_time);
			Robot rb=new Robot();
	 		rb.keyPress(KeyEvent.VK_DOWN);
	 		rb.keyRelease(KeyEvent.VK_DOWN);
	 		rb.keyPress(KeyEvent.VK_DOWN);
	 		rb.keyRelease(KeyEvent.VK_DOWN);
	 		rb.keyPress(KeyEvent.VK_ENTER);
	 		rb.keyRelease(KeyEvent.VK_ENTER);
	 		bu.clickOnElement(RandomScenariosPage.save);
		}
		
		
		@Test(priority = 37)
		public void loginTC_37() throws IOException, InterruptedException, AWTException {
			
			System.out.println("TC37");
			logger.info("TC_37 is Started");
			au.loginApp();
			bu.clickOnElement(RandomScenariosPage.Home_tab);
			bu.waitForElement(RandomScenariosPage.close_ad, driver);
			bu.clickOnElement(RandomScenariosPage.close_ad);
			bu.clickOnElement(RandomScenariosPage.click_currentdate);
			bu.clickOnElement(RandomScenariosPage.click_time4pm);
			bu.isElementVisible(RandomScenariosPage.click_combobox1);
			bu.waitForElement(RandomScenariosPage.click_combobox1, driver);
			bu.clickOnElement(RandomScenariosPage.click_combobox1);
			bu.waitForElement(RandomScenariosPage.click_combobox1, driver);
			driver.switchTo().frame(RandomScenariosPage.Ifrmae1);
			bu.clickOnElement(RandomScenariosPage.select_others);
			bu.isElementVisible(RandomScenariosPage.click_Others_combobox);
			bu.clickOnElement(RandomScenariosPage.click_Others_combobox);
			bu.clickOnElement(RandomScenariosPage.checkbox_recurrence);
			bu.clickOnElement(RandomScenariosPage.select_weekly);
			bu.clickOnElement(RandomScenariosPage.select_enddate);
			Robot rb=new Robot();
	 		rb.keyPress(KeyEvent.VK_DOWN);
	 		rb.keyRelease(KeyEvent.VK_DOWN);
	 		rb.keyPress(KeyEvent.VK_DOWN);
	 		rb.keyRelease(KeyEvent.VK_DOWN);
	 		rb.keyPress(KeyEvent.VK_ENTER);
	 		rb.keyRelease(KeyEvent.VK_ENTER);
	 		bu.clickOnElement(RandomScenariosPage.savedata);
			
			
			
			
		}
		
		
}