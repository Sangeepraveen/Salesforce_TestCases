package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	public static WebElement username;
	
	@FindBy(name	= "pw")
	public static WebElement password;
	
	@FindBy(xpath = "//div[@id='error']")
	public static WebElement pwd_error;
	
	@FindBy(id = "forgot_password_link")
	public static WebElement forgotpassword;
	
	@FindBy(id = "continue")
	public static WebElement forgotpwdcontinue;
	
	@FindBy(xpath = "//*[@id=\"forgotPassForm\"]/a")
	public static WebElement returntologin;
	
	@FindBy(name = "un")
	public static WebElement forgotpwd_username;
	
	@FindBy(id ="rememberUn")
	public static WebElement rememberme;
	
	@FindBy (id = "Login")
	public static WebElement loginbutton;
	
	@FindBy (xpath = "//*[@id=\"home_Tab\"]/a")
	public static WebElement hometab;
					  
	@FindBy (xpath = "//*[@id=\"userNav-arrow\"]")
	public static WebElement home_usermenu;
	
	@FindBy (xpath = "//*[@id=\"userNav-menuItems\"]/a[5]")
	public static WebElement usermenu_dropdown_logout;

//	public boolean isLoginPageDisplayed() {
//			
//		
//		if (driver.findElement().getText();)
//		try {
//			element.isDisplayed();
//			test.log(Status.INFO, "Element is displayed");
//			return true;
//		}
//		catch(NoSuchElementException e)
//		{
//			System.out.println("Exception encountered" + e.getMessage());
//			test.log(Status.INFO, "Element is not displayed");
//			return false;
//		}
//	}
//	
	public void loginToApp() {
		
	}
}
	