package sdfc_tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sdfc_pages.LeadsPage;
import sdfc_utilities.Data_Utilities;
import sdfc_utilities.Listener_Utilities;

@Listeners(Listener_Utilities.class)
public class Leads_test extends Base_test{
			
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
		
		@Test(priority = 20)
		public void loginTC_20() throws IOException, InterruptedException {
			
			System.out.println("TC20");
			logger.info("TC_20 is Started");
			au.loginApp();
			bu.clickOnElement(LeadsPage.Leads_tab);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.clickOnElement(LeadsPage.close_ad);

		}
		
		@Test(priority = 21)
		public void loginTC_21() throws IOException, InterruptedException {
			
			System.out.println("TC21");
			logger.info("TC_21 is Started");
			au.loginApp();
			bu.clickOnElement(LeadsPage.Leads_tab);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.clickOnElement(LeadsPage.close_ad);
			bu.clickOnElement(LeadsPage.click_ViewLeads);
		}
		
		@Test(priority = 22)
		public void loginTC_22() throws IOException, InterruptedException {
			
			System.out.println("TC22");
			logger.info("TC_22 is Started");
			au.loginApp();
			bu.clickOnElement(LeadsPage.Leads_tab);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.clickOnElement(LeadsPage.close_ad);
			bu.clickOnElement(LeadsPage.click_ViewLeads);
			bu.isElementSelected(LeadsPage.todays_Leads);
			bu.clickOnElement(LeadsPage.usermenu_dropdown);
			bu.clickOnElement(LeadsPage.logout);
			au.setUp();
			au.launchApp();
			au.loginApp();
			bu.clickOnElement(LeadsPage.Leads_tab1);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.clickOnElement(LeadsPage.close_ad);
			bu.clickOnElement(LeadsPage.click_go);
		}
		
		@Test(priority = 23)
		public void loginTC_23() throws IOException, InterruptedException {
			
			System.out.println("TC23");
			logger.info("TC_23 is Started");
			au.loginApp();
			bu.clickOnElement(LeadsPage.Leads_tab);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.clickOnElement(LeadsPage.close_ad);
			bu.clickOnElement(LeadsPage.click_go);
		}
		
		@Test(priority = 24)
		public void loginTC_24() throws IOException, InterruptedException {
			
			System.out.println("TC24");
			logger.info("TC_24 is Started");
			au.loginApp();
			bu.clickOnElement(LeadsPage.Leads_tab);
			bu.waitForElement(LeadsPage.close_ad, driver);
			bu.clickOnElement(LeadsPage.close_ad);
			bu.clickOnElement(LeadsPage.click_new);
			bu.isElementVisible(LeadsPage.l_name);
			bu.clickOnElement(LeadsPage.l_name);
			bu.clearText(LeadsPage.l_name);
			bu.sendText(LeadsPage.l_name, du.readAccountsProperties("prod.leads_lname"));
			bu.clickOnElement(LeadsPage.company_name);
			bu.clearText(LeadsPage.company_name);
			bu.sendText(LeadsPage.company_name, du.readAccountsProperties("prod.leads_accname"));
			bu.clickOnElement(LeadsPage.click_save_new);
			
		}
		
			
		
		
}