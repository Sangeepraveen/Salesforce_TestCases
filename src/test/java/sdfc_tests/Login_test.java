package sdfc_tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import sdfc_pages.LoginPage;
import sdfc_utilities.Listener_Utilities;



@Listeners(Listener_Utilities.class)
public class Login_test extends Base_test{
	
	long startTime = 0;
	long endTime = 0;
	
	@BeforeSuite
	public void setUp() throws IOException  {
		
		initializeLogging();
		initializeReport();
		startTime = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		au.launch_Browser();
		PageFactory.initElements(driver, LoginPage.class);
		//LoginPage LoginPage = new LoginPage(driver);
	}
	

	@BeforeMethod
	public void launchApp()
	{
		au.url();

	}
	
		
	@AfterSuite
	public void finishtest() {
		
		extent.flush();
		endTime = System.currentTimeMillis();
		System.out.println("Total time taken:" + (endTime-startTime));
		logger.info("Total time taken: "+ (endTime-startTime));
		logger.info("extent report flushed");
		driver.close();
	}

	@Test(priority = 0)
	public void loginTC_01() throws IOException, InterruptedException {
		
		System.out.println("TC01");
		logger.info("TC_01 is Started");
		SoftAssert sa = new SoftAssert();
		System.out.println("loginpage");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		bu.waitForElement(LoginPage.username, driver);
		bu.isElementVisible(LoginPage.username);
		bu.clearText(LoginPage.username);
		System.out.println("username");
		bu.sendText(LoginPage.username, du.readAccountsProperties("prod.username"));
		System.out.println("Entered username");
		bu.waitForElement(LoginPage.password, driver);
		bu.isElementVisible(LoginPage.password);
		bu.clearText(LoginPage.password);
		bu.waitForElement(LoginPage.loginbutton, driver);
		bu.clickOnElement(LoginPage.loginbutton);
		bu.waitForElement(LoginPage.pwd_error, driver);
		String actualErrorMessage = LoginPage.pwd_error.getText();
		
		System.out.println("Entered usernam" +actualErrorMessage);
		sa.assertEquals(actualErrorMessage,  du.readValidationText("Password.Error1"));
		sa.assertAll();
	}

	
	

	@Test(priority = 1)
	public void loginTC02() throws IOException, InterruptedException {
		
		
		System.out.println("TC02");
		logger.info("TC_02 is Started");
		bu.waitForElement(LoginPage.username, driver);
		bu.isElementVisible(LoginPage.username);
		bu.sendText(LoginPage.username, du.readAccountsProperties("prod.username"));
		bu.waitForElement(LoginPage.password, driver);
		bu.isElementVisible(LoginPage.password);
		bu.sendText(LoginPage.password, du.readAccountsProperties("prod.password"));
		bu.waitForElement(LoginPage.rememberme, driver);
		bu.clickOnElement(LoginPage.rememberme);
		bu.waitForElement(LoginPage.loginbutton, driver);
		bu.clickOnElement(LoginPage.loginbutton);
		Thread.sleep(3000);
		bu.isElementVisible(LoginPage.hometab);
		
	}
	
	@Test(priority = 2)
	public void loginTC03() throws InterruptedException, IOException {
		
		
		
		System.out.println("TC03");
		logger.info("TC_03 is Started");
		au.loginApp();
		logger.info("Salesforce Home page is displayed");
		//bu.waitForElement(LoginPage.home_usermenu, driver);
		bu.clickOnElement(LoginPage.home_usermenu);
		bu.isElementVisible(LoginPage.home_usermenu);
		bu.clickOnElement(LoginPage.usermenu_dropdown_logout);
		//bu.isElementVisible(LoginPage.username);
		
	}
	
	@Test(priority = 3)
	public void loginTC04a() throws IOException {
		
		
		
		System.out.println("TC04a");
		logger.info("TC_04a is Started");
		bu.waitForElement(LoginPage.username, driver);
		bu.isElementVisible(LoginPage.username);
		bu.clickOnElement(LoginPage.forgotpassword);
		bu.waitForElement(LoginPage.forgotpwd_username, driver);
		bu.sendText(LoginPage.forgotpwd_username, du.readAccountsProperties("prod.username"));
		bu.clickOnElement(LoginPage.forgotpwdcontinue);
		bu.waitForElement(LoginPage.returntologin, driver);
		bu.isElementVisible(LoginPage.returntologin);
		
		
	}
	
	@Test(priority = 4)
	public void loginTC04b() throws InterruptedException, IOException {
		
		
		System.out.println("TC04b");
		logger.info("TC_4b is Started");
		SoftAssert sa = new SoftAssert();
		bu.waitForElement(LoginPage.username, driver);
		bu.sendText(LoginPage.username, du.readAccountsProperties("prod.wrongusername"));
		bu.waitForElement(LoginPage.password, driver);
		bu.sendText(LoginPage.password, du.readAccountsProperties("prod.wrongpassword"));
		Thread.sleep(3000);
		bu.waitForElement(LoginPage.loginbutton, driver);
		bu.clickOnElement(LoginPage.loginbutton);
		bu.clickOnElement(LoginPage.username);
		String actualErrorMessage = driver.findElement(By.id("error")).getText();
		sa.assertEquals(actualErrorMessage,  du.readValidationText("Password.Error"));
		sa.assertAll();
		
	}
	
}


	