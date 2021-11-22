package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
				
	//@FindBy(xpath = "//*[@id=\"Contact_Tab\"]")
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public static WebElement Contacts_tab;
	
	@FindBy(css = "#tryLexDialogX")
	public static WebElement close_ad;
	
	@FindBy(xpath = "//input[@name='new']")
	public static WebElement click_new;
	
	@FindBy(xpath = "//input[@id='name_lastcon2']")
	public static WebElement contacts_lname;
	
	@FindBy(xpath = "//input[@id='con4']")
	public static WebElement contacts_accname;
	
	@FindBy(xpath = "//input[@name='save']")
	public static WebElement click_save;
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	public static WebElement create_Newview;
	
	@FindBy(xpath = "//input[@id='fname']")
	public static WebElement view_Name;
	
	@FindBy(xpath = "//input[@id='devname']")
	public static WebElement view_Uniquename;
	
	@FindBy(xpath = "//*[@id=\"hotlist_mode\"]/option[1]")
	public static WebElement recently_Created;
	
	@FindBy(xpath = "//*[@name=\"fcf\"]/option[10]")
	public static WebElement my_contacts;
	
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[5]/th/a")
	public static WebElement click_onName;
	
	@FindBy(xpath = "//input[@id='devname']")
	public static WebElement unique_name;
	
	@FindBy(xpath = "//input[@name='cancel']")
	public static WebElement cancel_click;
	
	@FindBy(xpath = "//input[@name='save_new']")
	public static WebElement save_new;
	
}
