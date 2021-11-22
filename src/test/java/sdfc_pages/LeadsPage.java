package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	

	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
				
	@FindBy(xpath = "//*[@id=\"Lead_Tab\"]/a")
	public static WebElement Leads_tab;
	
	@FindBy(css = "#tryLexDialogX")
	public static WebElement close_ad;
	
	@FindBy(xpath = "//*[@id=\"fcf\"]")
	public static WebElement click_ViewLeads;
	
	@FindBy(xpath = "//*[@id=\"fcf\"]/option[4]")
	public static WebElement todays_Leads;
	
	@FindBy(xpath = "//*[@id=\"userNav-arrow\"]")
	public static WebElement usermenu_dropdown;
	
	@FindBy(xpath = "//*[@id=\"userNav-menuItems\"]/a[5]")
	public static WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"Lead_Tab\"]/a")
	public static WebElement Leads_tab1;
	
	@FindBy(name = "go")
	public static WebElement click_go;

	@FindBy(name = "new")
	public static WebElement click_new;
	
	@FindBy(xpath = "//*[@id='name_lastlea2']")
	public static WebElement l_name;
	
	@FindBy(xpath = "//*[@id='lea3']")
	public static WebElement company_name;
	
	@FindBy(xpath = "//input[@name='save_new']")
	public static WebElement click_save_new;
}
