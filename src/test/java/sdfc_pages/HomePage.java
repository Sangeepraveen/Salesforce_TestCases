package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
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
	

}
