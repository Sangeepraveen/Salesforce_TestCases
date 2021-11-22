package sdfc_utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdfc_pages.ContactsPage;
import sdfc_pages.CreateAccountPage;
import sdfc_pages.CreateOppPage;
import sdfc_pages.HomePage;
import sdfc_pages.LeadsPage;
import sdfc_pages.LoginPage;
import sdfc_pages.RandomScenariosPage;
import sdfc_pages.UserMenuPage;
import sdfc_tests.Base_test;

public class App_Utilities extends Base_test {
	
	//public static LoginPage loginPage;
	

	long startTime = 0;
	long endTime = 0;
	
	public void launch_Browser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void url() {
//		driver.get("https://login.salesforce.com");
//		WebElement username = driver.findElement(By.id("username"));
//		bu.waitForElement(username, driver);
		
		driver = getDriver("chrome", false);
		driver.manage().window().maximize();
		//PageFactory.initElements(driver, LoginPage.class);
		loginpage = new LoginPage(driver);
		PageFactory.initElements(driver, UserMenuPage.class);
		PageFactory.initElements(driver, CreateAccountPage.class);
		PageFactory.initElements(driver, CreateOppPage.class);
		PageFactory.initElements(driver, LeadsPage.class);
		PageFactory.initElements(driver, ContactsPage.class);
		PageFactory.initElements(driver, RandomScenariosPage.class);	
		PageFactory.initElements(driver, HomePage.class);
		
		driver.get("https://login.salesforce.com");
	}
	
			
		public void loginApp() throws IOException, InterruptedException {
		
		
			bu.clearText(LoginPage.username);
			//bu.waitForElement(LoginPage.username, driver);
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

		public void setUp() throws IOException {
			
			initializeLogging();
			initializeReport();
			startTime = System.currentTimeMillis();
			System.out.println(System.currentTimeMillis());
			//driver = getDriver(browserName, true);
			au.launch_Browser();
			PageFactory.initElements(driver, LoginPage.class);
			PageFactory.initElements(driver, UserMenuPage.class);
			PageFactory.initElements(driver, CreateAccountPage.class);
			PageFactory.initElements(driver, CreateOppPage.class);
			PageFactory.initElements(driver, LeadsPage.class);
			PageFactory.initElements(driver, ContactsPage.class);
			PageFactory.initElements(driver, RandomScenariosPage.class);	
			PageFactory.initElements(driver, HomePage.class);
		}
		
		public void launchApp() throws IOException, InterruptedException {
			driver.get("https://login.salesforce.com");
			WebElement username = driver.findElement(By.id("username"));
			bu.waitForElement(username, driver);
}
	
		public void logoutApp() {
			
			
			extent.flush();
			endTime = System.currentTimeMillis();
			System.out.println("Total time taken:" + (endTime-startTime));
			logger.info("Total time taken: "+ (endTime-startTime));
			logger.info("extent report flushed");
			//driver.close();
		}

		
}

