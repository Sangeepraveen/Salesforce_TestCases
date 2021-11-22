package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomScenariosPage {

	WebDriver driver;
	public RandomScenariosPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
				
	@FindBy(xpath = "//*[@id=\"home_Tab\"]/a")
	public static WebElement Home_tab;
	
	@FindBy(xpath = "//h1[@class='currentStatusUserName']")
	public static WebElement profile_name;
	
	@FindBy(css = "#tryLexDialogX")
	public static WebElement close_ad;
	
	@FindBy(css = "#chatterTab > div.leftContent > div.contactInfo.profileSection > div.vfButtonBar > h3 > div > div > a > img")
	public static WebElement editbutton;
	
	@FindBy(xpath = "//iframe[@id='contactInfoContentId']")
	public static WebElement switch_Iframe; //Switched Iframe
	
	@FindBy(xpath = "//*[@id=\"aboutTab\"]/a")
	public static WebElement aboutTab;  //clicked About tab
	
	@FindBy(xpath = "//input[@id='lastName']")
	public static WebElement last_Name;
	
	@FindBy(xpath = "//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")
	public static WebElement click_saveall;
	
	@FindBy(xpath = "//*[@id=\"AllTab_Tab\"]/a/img")
	public static WebElement alltabs;
	
	@FindBy(xpath = "//input[@name='customize']")
	public static WebElement customize_tabs;
	
	//@FindBy(xpath = "//*[@id=\"duel_select_1\"]/option[2]")
	@FindBy(css = "#duel_select_1 > option:nth-child(2)")
	public static WebElement select_tab;
	
	@FindBy(xpath = "//*[@class='leftArrowIcon']")
	public static WebElement remove_icon;
	
	@FindBy(xpath = "//input[@name='save']")
	public static WebElement save;
	
	@FindBy(className = "menuButtonLabel")
	public static WebElement usermenu_dropdown;
	
	@FindBy(xpath = "//*[@id=\\\"userNav-menuItems\\\"]/a[5]")
	public static WebElement usermenu_dropdown_Logout;
	
	@FindBy(xpath = "//span[@class='pageDescription']//a[1]")
	public static WebElement click_currentdate;
	
	@FindBy(xpath = "//a[contains(text(), '8:00 PM')]")
	public static WebElement click_time8pm;
	
	@FindBy(xpath = "//img[@class='comboboxIcon']")
	public static WebElement combobox_Icon;
	
	@FindBy(xpath = "//li[@class='listItem4']")
	public static WebElement select_combobox;
	
	@FindBy(xpath = "//div[2]//li[5]")
	public static WebElement Iframe;
	
	@FindBy(xpath = "//input[@id='evt5']")
	public static WebElement click_Others_combobox;
	
	@FindBy(xpath = "//input[@id='EndDateTime_time']")
	public static WebElement enddate_time;
	
	@FindBy(xpath = "//a[contains(text(), '4:00 PM')]")
	public static WebElement click_time4pm;
	
	@FindBy(xpath = "//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img")
	public static WebElement click_combobox1;
	
	@FindBy(xpath = "/html/body/div[2]/ul/li[5]/a")
	public static WebElement select_others;
	
	@FindBy(xpath = "//div[2]//li[5]")
	public static WebElement Ifrmae1;
	
	@FindBy(xpath = "//*[@id=\"IsRecurrence\"]")
	public static WebElement checkbox_recurrence;
	
	@FindBy(xpath = "//*[@id=\"rectypeftw\"]")
	public static WebElement select_weekly;
	
	@FindBy(xpath = "//*[@id=\"RecurrenceEndDateOnly\"]")
	public static WebElement select_enddate;
	
	@FindBy(name = "save")
	public static WebElement savedata;
	
	
}