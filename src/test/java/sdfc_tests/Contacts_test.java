package sdfc_tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sdfc_pages.ContactsPage;
import sdfc_utilities.Data_Utilities;
import sdfc_utilities.Listener_Utilities;

@Listeners(Listener_Utilities.class)
public class Contacts_test extends Base_test{
			
		//Basic_Utilities bu = new Basic_Utilities();
		Data_Utilities du = new Data_Utilities();
		
		@BeforeSuite
		public void setUp() throws IOException {
			
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
		
		@Test(priority = 25)
		public void loginTC_25() throws IOException, InterruptedException {
			
			System.out.println("TC25");
			logger.info("TC_25 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.click_new);
			bu.waitForElement(ContactsPage.contacts_lname, driver);
			bu.clickOnElement(ContactsPage.contacts_lname);
			bu.sendText(ContactsPage.contacts_lname, du.readAccountsProperties("prod.contacts_lname"));
			bu.clickOnElement(ContactsPage.contacts_accname);
			bu.sendText(ContactsPage.contacts_accname, du.readAccountsProperties("prod.contacts_accname"));
			bu.clickOnElement(ContactsPage.click_save);
			
		}
		
		@Test(priority = 26)
		public void loginTC_26() throws IOException, InterruptedException {
			
			System.out.println("TC26");
			logger.info("TC_26 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.create_Newview);
			bu.clickOnElement(ContactsPage.view_Name);
			bu.clearText(ContactsPage.view_Uniquename);			
			bu.sendText(ContactsPage.view_Name, du.readAccountsProperties("prod.contacts_viewName"));
			bu.clickOnElement(ContactsPage.view_Uniquename);
			bu.clearText(ContactsPage.view_Uniquename);
			bu.sendText(ContactsPage.view_Uniquename, du.readAccountsProperties("prod.contacts_ViewUniqueName"));
			bu.clickOnElement(ContactsPage.click_save);
			}
		
		@Test(priority = 27)
		public void loginTC_27() throws IOException, InterruptedException {
			
			System.out.println("TC27");
			logger.info("TC_27 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.recently_Created);
		}
		
		
		@Test(priority = 28)
		public void loginTC_28() throws IOException, InterruptedException {
			
			System.out.println("TC28");
			logger.info("TC_28 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.isElementSelected(ContactsPage.my_contacts);
			bu.clickOnElement(ContactsPage.my_contacts);
}
		
		@Test(priority = 29)
		public void loginTC_29() throws IOException, InterruptedException {
			
			System.out.println("TC29");
			logger.info("TC_29 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.click_onName);
		}
		
		@Test(priority = 30)
		public void loginTC_30() throws IOException, InterruptedException {
			
			System.out.println("TC30");
			logger.info("TC_30 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.create_Newview);
			bu.clickOnElement(ContactsPage.unique_name);
			bu.sendText(ContactsPage.unique_name, du.readAccountsProperties("prod.contacts_UniqueName"));
			bu.clickOnElement(ContactsPage.click_save);
		}
		
		@Test(priority = 31)
		public void loginTC_31() throws IOException, InterruptedException {
			
			System.out.println("TC31");
			logger.info("TC_31 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.create_Newview);
			bu.clickOnElement(ContactsPage.view_Name);
			bu.clearText(ContactsPage.view_Name);
			bu.sendText(ContactsPage.view_Name, du.readAccountsProperties("prod.contacts_ViewName1"));
			bu.clickOnElement(ContactsPage.view_Uniquename);
			bu.clearText(ContactsPage.unique_name);
			bu.sendText(ContactsPage.unique_name, du.readAccountsProperties("prod.contacts_ViewUniqueName1"));
			bu.clickOnElement(ContactsPage.cancel_click);
		}
		
		@Test(priority = 32)
		public void loginTC_32() throws IOException, InterruptedException {
			
			System.out.println("TC32");
			logger.info("TC_32 is Started");
			au.loginApp();
			bu.waitForElement(ContactsPage.Contacts_tab, driver);
			bu.clickOnElement(ContactsPage.Contacts_tab);
			bu.waitForElement(ContactsPage.close_ad, driver);
			bu.clickOnElement(ContactsPage.close_ad);
			bu.clickOnElement(ContactsPage.click_new);
			bu.clickOnElement(ContactsPage.contacts_lname);
			bu.clearText(ContactsPage.contacts_lname);
			bu.sendText(ContactsPage.contacts_lname, du.readAccountsProperties("prod.contacts_lname1"));
			bu.clickOnElement(ContactsPage.contacts_accname);
			bu.clearText(ContactsPage.contacts_accname);
			bu.sendText(ContactsPage.contacts_accname, du.readAccountsProperties("prod.contacts_accName1"));
			bu.clickOnElement(ContactsPage.save_new);
		}
}
