package sdfc_utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import sdfc_Configs.TestWaits;
import sdfc_tests.Base_test;

	//This class will have all the functions of its nature
public class Basic_Utilities extends Base_test{
		
			//WebDriver driver;
		
		//Click
		public void clickOnElement(WebElement element) {
			element.click();
			test.log(Status.INFO, "Clicked on element");
		}
		
		//Sending text
				
		public void sendText(WebElement element, String text) {
			element.sendKeys(text);
			test.log(Status.INFO, "Entered text as:" +text);
			
		}
		
		
		
		//This function return a true value if element is visible else it will return false
		public boolean isElementVisible(WebElement element) {
			try {
				element.isDisplayed();
				test.log(Status.INFO, "Element is visible");
				return true;
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Exception encountered" + e.getMessage());
				test.log(Status.INFO, "Element is notvisible");
				return false;
			}
				
		}
		
		//This function returns a true value if element is selected else it will return false
		public boolean isElementSelected(WebElement element) {
			try {
				element.isSelected();
				test.log(Status.INFO, "Element is selected");
				return true;
				}
			catch(Exception e)
			{
				System.out.println("Exception encountered" + e.getMessage());
				test.log(Status.INFO, "Element is not selected");
				return false;
			}
				
		}
		
		
		public String readTextFromElement(WebElement element) {
			test.log(Status.INFO, "Fetching the text as:"+ element.getText());
			return element.getText();
		}
		
		public void selectElementFromDropdown(WebElement element, String dropdownValue) {
			Select s = new Select(element);
			test.log(Status.INFO, "Element is selected from dropdown");
			s.selectByValue(dropdownValue);
			
		}
		
		public void clearText(WebElement element) {
			element.clear();
		}
		
		public void moveFocusOnToElement(WebElement element, WebDriver driver ) {
		
			Actions action = new Actions(driver);
			action.moveToElement(element);
			
	}
		
		public void waitForElement(WebElement element, WebDriver driver) {
			
			WebDriverWait wait = new WebDriverWait(driver, TestWaits.WAIT_FOR_ELEMENT);
			wait.until(ExpectedConditions.visibilityOf(element));
			
		}
		
		public void selectElementText(WebElement element) {
			Select select = new Select(element);
			select.selectByVisibleText("element");
		}
		
		public void selectElementValue(WebElement element) {
			
			Select select = new Select(element);
			select.selectByValue("element");
		}
		
//		public void selectElementIndex(WebElement value) {
//			Select select = new Select(value);
//			select.deselectByIndex(value);
//		}

		
		public String getScreenCapture(WebDriver driver) throws IOException {
//			Date date = new Date();
			DateFormat df = new SimpleDateFormat();
			Date date = Calendar.getInstance().getTime();
			String dateFormat = df.format(date).replaceAll("/", "_").replaceAll(":", "_").replaceAll(" ", "_");
			String path= System.getProperty("user.dir")+"//target//Reports//"+dateFormat+".PNG";
			
			//C:\Users\Sangeetha\eclipse-workspace\SDFC_New\target\Reports
			//Mithun
			//String path= System.getProperty("user.dir")+"//target//Reports//"+dateFormat+".PNG";
			System.out.println(path);
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
			return path;
		}
}		

		

		

		
	


