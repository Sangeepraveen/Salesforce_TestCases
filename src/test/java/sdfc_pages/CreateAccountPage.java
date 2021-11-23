package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	
	public CreateAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
				
	@FindBy(xpath = "//*[@id=\"Account_Tab\"]/a")
	public static WebElement Account_tab;
	
	@FindBy(css = "#tryLexDialogX")
	public static WebElement close_ad;
	
	@FindBy(name = "new")
	public static WebElement newbutton;
	
	@FindBy(name = "acc2")
	public static WebElement acc_name;
	
	@FindBy(xpath = "//*[@id=\"acc6\"]/option[4]")
	public static WebElement acc_type;
	
	@FindBy(xpath = "//*[@id=\"00N5f00000K4yp0\"]/option[4]")
	public static WebElement acc_priority;
	
	@FindBy(name = "save")
	public static WebElement click_save;
	
	@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a[2]" )
	public static WebElement create_Newview;
	
	@FindBy(name = "fname")
	public static WebElement view_name;
	
	@FindBy(name = "devname")
	public static WebElement view_uniquename;
	
	@FindBy(name = "save")
	public static WebElement save_NewView;
	
	@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a[1]")
	public static WebElement click_editbutton;
	
	@FindBy(name = "fname")
	public static WebElement edit_viewname;
	
	@FindBy(name = "devname")
	public static WebElement edit_uniquename;
	
	@FindBy(xpath = "//*[@id=\"fcol1\"]/option[2]")
	public static WebElement Filter_Field;
	
	@FindBy(xpath = "//*[@id=\"fop1\"]/option[4]")
	public static WebElement Filter_Operator;
	
	@FindBy(xpath = "//*[@id=\"fval1\"]")
	public static WebElement Filter_Contains;
	
	@FindBy(xpath = "//*[@id=\"colselector_select_0\"]/option[31]")
	public static WebElement select_Lastactivity;
	
	@FindBy(className = "rightArrowIcon")
	public static WebElement add;
	
	@FindBy(xpath = "//*[@id=\"cid0\"]")
	public static WebElement select1;
	
	@FindBy(xpath = "//*[@id=\"cid1\"]")
	public static WebElement select2;
	
	@FindBy(name = "save")
	public static WebElement save_Edit;
	
	@FindBy(xpath = "//a[contains(text(),'Merge Accounts')]")
	public static WebElement Merge_account;
	
	@FindBy(xpath = "//input[@id='srch']")
	public static WebElement name_mergerecords;
	
	@FindBy(xpath = "//input[@name='srchbutton']")
	public static WebElement click_findaccounts;
	
	@FindBy(xpath = "//input[@name='goNext']")
	public static WebElement click_next;
	
	@FindBy(xpath = "//input[@name='save']")
	public static WebElement click_merge_button;
		//13thTEstcase
	
	@FindBy(xpath = "//a[contains(text(), 'Accounts with last activity')]")
	public static WebElement Acc_last_activity;
	
	@FindBy(id = "ext-gen148")
	public static WebElement datefield;
	
	@FindBy(id = "ext-gen152")
	public static WebElement from_date;
	
	@FindBy(id = "ext-gen154")
	public static WebElement to_date;
	
	@FindBy(xpath = "//button[@id='ext-gen49']")
	public static WebElement save_lastactivity;
	
	@FindBy(xpath = "//*[@id=\"saveReportDlg_reportNameField\"]")
	public static WebElement Report_name;
	
	@FindBy(xpath = "//*[@id=\"saveReportDlg_DeveloperName\"]")
	public static WebElement Report_Uniquename;
	
	@FindBy(xpath = "//*[@id=\"ext-gen314\"]")
	public static WebElement save_Report;
}





