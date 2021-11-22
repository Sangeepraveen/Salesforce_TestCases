package sdfc_tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import sdfc_Configs.TestConstants;
import sdfc_pages.LoginPage;
import sdfc_utilities.App_Utilities;
import sdfc_utilities.Basic_Utilities;
import sdfc_utilities.Data_Utilities;

public class Base_test {

	public static WebDriver driver = null;
	public static final int WAIT_FOR_ELEMENT = 30;
	public static Object wait;
	static String reportPath = System.getProperty("user.dir") + "//target//Reports//TestCase.html";
	//C:\Users\Sangeetha\eclipse-workspace\SDFC_New\target\Reports
	//static String reportPath = System.getProperty("C:\\Users\\Sangeetha\\eclipse-workspace\\SDFC_New\\Reports\\TC_report.html");
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlreport;
	public static ExtentTest test = null;
		
	public Logger logger = Logger.getLogger(getClass().getSimpleName());
	public static Basic_Utilities bu = new Basic_Utilities();
	public static Data_Utilities du = new Data_Utilities();
	//public static CreateAccountPage accountPage = new CreateAccountPage();
	public static App_Utilities au = new App_Utilities();
	public static LoginPage loginpage;
	
public static  void initializeReport() {
		
		System.out.println("Report inside - Base_test");
		String appendTimeToReport = new SimpleDateFormat("yyyy_MM_dd_hhmmss").format(new Date());
		System.out.println("Report time");
		extent = new ExtentReports();	
		htmlreport = new ExtentHtmlReporter(
				TestConstants.sReportPath + "_TestCases_" + appendTimeToReport + ".html");
		extent.attachReporter(htmlreport);
		
}

	public WebDriver getDriver(String browserName, boolean enableHeadlessMode) {
		
		String sBrowserName = browserName.toLowerCase();
		switch(sBrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			logger.info("Chromedriver setup is done");
			if(enableHeadlessMode)
			{
				driver = new ChromeDriver(enableHeadlessMode());
				logger.info("Chromedriver headless mode configured");
			} 
			else 
			{
				driver = new ChromeDriver();
			}
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
	
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
		}
		
		return driver;
	}

	public void initializeLogging() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(TestConstants.sLog4JpropertiesPath);
		prop.load(fis);
		PropertyConfigurator.configure(prop);
		}
	
	public ChromeOptions enableHeadlessMode() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--ignore-certificate-errors");
		return options;
	}

		
		
	}




