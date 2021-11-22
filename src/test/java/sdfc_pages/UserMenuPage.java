package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMenuPage {
	
	public UserMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
				
	@FindBy(className = "menuButtonLabel")
	public static WebElement usermenu_dropdown;
	
	@FindBy(xpath = "//*[@id=\\\"userNav-menuItems\\\"]/a[5]")
	public static WebElement usermenu_dropdown_Logout;

	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[1]")
	public static WebElement usermenu_dropdown_MyProfile;
	
	//@FindBy(xpath = "\"//*[@id=\\\"chatterTab\\\"]/div[2]/div[2]/div[1]/h3/div/div/a/img\"")
	@FindBy(css = "#chatterTab > div.leftContent > div.contactInfo.profileSection > div.vfButtonBar > h3 > div > div > a > img")
	public static WebElement editbutton;
	
	@FindBy(xpath = "//iframe[@id='contactInfoContentId']")
	public static WebElement switch_Iframe; //Switched Iframe
	
	@FindBy(xpath = "//*[@id=\"aboutTab\"]/a")
	public static WebElement aboutTab;  //clicked About tab
	
	@FindBy(xpath = "//input[@id='lastName']")
	public static WebElement lastName;
		
	@FindBy(xpath = "//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")
	public static WebElement save_all;
	
	@FindBy(xpath = "//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")
	public static WebElement post_button;
	
	@FindBy(xpath = "//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")
	public static WebElement switch_Iframe1;
	
	@FindBy(xpath = "//html[1]/body[1]")
	public static WebElement postMessage;
	
	@FindBy(xpath = "//*[@id=\"publishersharebutton\"]")
//	@FindBy(xpath = "//*[@id=\"publisherBottomBar\"]/div[1]")
	public static WebElement clickshare_button;

	@FindBy(xpath = "//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")
	public static WebElement filetab;
	
	@FindBy(xpath = "//*[@id=\"chatterUploadFileAction\"]")
	public static WebElement uploadfile_computer;
	
	@FindBy(id = "chatterFile")
	public static WebElement choosefile_computer;
	
	@FindBy(id = "publishersharebutton")
	public static WebElement publishsharebutton;
	
	@FindBy(xpath = "//div[@id='listItem-addPhoto']/a[1]")
	public static WebElement add_profilephoto;
	
	@FindBy(xpath = "//iframe[@id='uploadPhotoContentId']")
	public static WebElement switch_Iframe2;
	
	@FindBy(xpath = "//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")
	public static WebElement clickphoto_choosefile;
	
	@FindBy(xpath = "//input[@id = \\\"j_id0:uploadFileForm:uploadBtn\\\"]")
	public static WebElement savephoto;
	
	@FindBy(xpath = "//input[@value='Save']")
	public static WebElement save_cropPhoto;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[2]")
	public static WebElement Mysettings;
	
	@FindBy(xpath = "//*[@id=\"PersonalInfo\"]/a")
	public static WebElement click_personalinfo;
	
	@FindBy(id = "LoginHistory_font")
	public static WebElement click_Loginhistory;
	
	@FindBy(xpath ="//div[@class='pShowMore']")
	public static WebElement download_login_history;
	
	@FindBy(id = "DisplayAndLayout_font")
	public static WebElement click_display_Layout;
	
	@FindBy(xpath = "//*[@id=\"CustomizeTabs_font\"]")
	public static WebElement click_customizetab;
	
	@FindBy(xpath = "//*[@id=\"p4\"]/option[9]")
	public static WebElement salesforcechatter;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0\"]/option[78]")
	public static WebElement Reportstab;
	
	@FindBy(xpath = "//*[@id=\"duel_select_0_right\"]/img")
	public static WebElement click_add;
	
	@FindBy(name = "save")
	public static WebElement save_reporttab;
	
	@FindBy(xpath = "//*[@id=\"EmailSetup\"]/a")
	public static WebElement email_tab;
	
	@FindBy(xpath = "//*[@id=\"EmailSettings_font\"]")
	public static WebElement email_settings;
	
	@FindBy(name = "sender_name")
	public static WebElement send_name;
	
	@FindBy(name = "sender_email")
	public static WebElement send_email;
	
	@FindBy(name = "auto_bcc")
	public static WebElement auto_click;
	
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public static WebElement email_Save;
	
	@FindBy(xpath = "//a@class = 'setupSection']")
	public static WebElement tab_settings;
	
	@FindBy(xpath = "//*[@id=\"CalendarAndReminders_font\"]")
	public static WebElement calendermind_click;
	
	@FindBy(xpath = "//*[@id=\"Reminders_font\"]")
	public static WebElement activityremind;
	
	@FindBy(xpath = "//*[@id=\"testbtn\"]")
	public static WebElement testremind_click;
	
	@FindBy(xpath = "//a[contains(text(), 'Developer Console')]")
	public static WebElement Developer_console;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[5]")
	public static WebElement click_logout;
	
}
