package sdfc_pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import sdfc_tests.Base_test;
import sdfc_utilities.Data_Utilities;


public class BasePage extends Base_test{
	
	Data_Utilities du = new Data_Utilities();
	//Basic_Utilities 
	
	@BeforeSuite
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, LoginPage.class);
		initializeReport();
		
	}
	
	@BeforeTest
	public void launchApp() {
		driver.get("https://login.salesforce.com");
		WebElement username = driver.findElement(By.id("username"));
		bu.waitForElement(username, driver);

	}
	
	@AfterSuite
	public void finishtest() {
		
		extent.flush();
	}
	
	
	@Test
	public void loginPageApp() throws IOException {
		
		//PageFactory.initElements(driver, LoginPage.class);
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
		//Thread.sleep(3000);
		bu.isElementVisible(LoginPage.hometab);
		
	}

}

