package sdfc_tests;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import sdfc_pages.CreateOppPage;
import sdfc_pages.RandomScenariosPage;
import sdfc_utilities.Data_Utilities;
import sdfc_utilities.Listener_Utilities;

@Listeners(Listener_Utilities.class)
public class CreateOpp_test extends Base_test{
		
		
		Data_Utilities du = new Data_Utilities();
		
		
		@BeforeSuite
		public void setUp() throws IOException
		{
			au.setUp();
					
		}
		
		@BeforeMethod
		public void launchApp() 
		{
			au.url();
		}
		
		@AfterSuite
		public void finishtest() {
			
			au.logoutApp();
		}
		
		@Test(priority = 15)
		public void loginTC_15() throws IOException, InterruptedException {
			
			System.out.println("TC15");
			logger.info("TC_15 is Started");
			au.loginApp();
			bu.clickOnElement(CreateOppPage.Opportunities_tab);
			bu.waitForElement(CreateOppPage.close_ad, driver);
			bu.clickOnElement(CreateOppPage.close_ad);
			bu.clickOnElement(CreateOppPage.opp_dropdown);
			}
		
		@Test(priority = 16)
		public void loginTC_16() throws IOException, InterruptedException {
			
			System.out.println("TC16");
			logger.info("TC_16 is Started");
			au.loginApp();
			bu.clickOnElement(CreateOppPage.Opportunities_tab);
			bu.waitForElement(CreateOppPage.close_ad, driver);
			bu.clickOnElement(CreateOppPage.close_ad);
			bu.clickOnElement(CreateOppPage.click_New);
			bu.clickOnElement(CreateOppPage.click_OppName);
			bu.clearText(CreateOppPage.click_OppName);
			bu.sendText(CreateOppPage.click_OppName, du.readAccountsProperties("prod.oppor_Name"));
			
			bu.clickOnElement(CreateOppPage.browse_Opp_AccName);
			driver.switchTo().frame(CreateOppPage.browse_Opp_AccName);
			bu.isElementVisible(CreateOppPage.Selectname);
			bu.clickOnElement(CreateOppPage.Selectname);
			//bu.clearText(CreateOppPage.click_Opp_AccName);
			//bu.sendText(CreateOppPage.click_Opp_AccName, du.readAccountsProperties("prod.oppor_AccNam"));
			
			bu.clickOnElement(CreateOppPage.click_closedate);
			bu.clickOnElement(CreateOppPage.click_closedatemonth);
			bu.clickOnElement(CreateOppPage.click_closedate_date);
			bu.clickOnElement(CreateOppPage.click_Stage);
			bu.clickOnElement(CreateOppPage.click_probability);
			bu.clearText(CreateOppPage.click_probability);
			bu.sendText(CreateOppPage.click_probability, du.readAccountsProperties("prod.oppor_Probability"));
			bu.clickOnElement(CreateOppPage.click_leadSource);
			bu.clickOnElement(CreateOppPage.click_primaryCamp);
			bu.clearText(CreateOppPage.click_primaryCamp);
			bu.sendText(CreateOppPage.click_primaryCamp, du.readAccountsProperties("prod.oppor_Primary_Campaign"));
			bu.clickOnElement(CreateOppPage.savebutton);
			
		}
		
		@Test(priority = 17)
		public void loginTC_17() throws IOException, InterruptedException {
			
			System.out.println("TC17");
			logger.info("TC_17 is Started");
			au.loginApp();
			bu.clickOnElement(CreateOppPage.Opportunities_tab);
			bu.clickOnElement(CreateOppPage.close_ad);
			bu.clickOnElement(CreateOppPage.Opp_Pipeline);
		}
		
		
		@Test(priority = 18)
		public void loginTC_18() throws IOException, InterruptedException {
			
			System.out.println("TC18");
			logger.info("TC_18 is Started");		
			au.loginApp();
			bu.clickOnElement(CreateOppPage.Opportunities_tab);
			bu.waitForElement(CreateOppPage.close_ad, driver);
			bu.clickOnElement(CreateOppPage.close_ad);
			bu.clickOnElement(CreateOppPage.Opp_Stuckopp);
			}
		
		@Test(priority = 19)
		public void loginTC_19() throws IOException, InterruptedException {
			
			System.out.println("TC19");
			logger.info("TC_19 is Started");		
			au.loginApp();
			bu.clickOnElement(CreateOppPage.Opportunities_tab);
			bu.waitForElement(CreateOppPage.close_ad, driver);
			bu.clickOnElement(CreateOppPage.close_ad);
			bu.clickOnElement(CreateOppPage.Quart_Interval);
			bu.clickOnElement(CreateOppPage.Quart_Include);
			bu.clickOnElement(CreateOppPage.run_Report);
		}
			
			
	}

