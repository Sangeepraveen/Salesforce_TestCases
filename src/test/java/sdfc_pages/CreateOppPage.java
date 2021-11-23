package sdfc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOppPage {

	public CreateOppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
				
	@FindBy(xpath = "//*[@id=\"Opportunity_Tab\"]/a")
	public static WebElement Opportunities_tab;
	
	@FindBy(css = "#tryLexDialogX")
	public static WebElement close_ad;
	
	@FindBy(xpath ="//*[@id=\"fcf\"]")
	public static WebElement opp_dropdown;
	
	@FindBy(name = "new")
	public static WebElement click_New;
	
	@FindBy(xpath = "//input[@id='opp3']")
	public static WebElement click_OppName;
	
	@FindBy(xpath = "//*[@id=\"opp4_lkwgt\"]/img")
	public static WebElement browse_Opp_AccName;
	
	@FindBy(xpath = "//*[@id=\"new\"]/div/div[3]/div/div[2]/table/tbody/tr[2]/th/a")
	public static WebElement Selectname;
	
	@FindBy(xpath = "//input[@id='opp9']")
	public static WebElement click_closedate;
	
	@FindBy(xpath = "//img[contains(@class,'calRight')]")
	public static WebElement click_closedatemonth;
	
	@FindBy(xpath = "//tr[@id='calRow1']//td[@class='weekday'][contains(text(),'2')]")
	public static WebElement click_closedate_date;
	
	@FindBy(xpath = "//*[@id=\"opp11\"]/option[3]")
	public static WebElement click_Stage;
	
	@FindBy(xpath = "//*[@id=\"opp12\"]")
	public static WebElement click_probability;
	
	@FindBy(xpath = "//*[@id=\"opp6\"]/option[3]")
	public static WebElement click_leadSource;
	
	@FindBy(xpath = "//*[@id=\"opp17\"]")
	public static WebElement click_primaryCamp;
	
	@FindBy(name = "save")
	public static WebElement savebutton;
	
	@FindBy(xpath = "//a[contains(text(),'Opportunity Pipeline')]")
	public static WebElement Opp_Pipeline;
	
	@FindBy(xpath = "//a[contains(text( ), 'Stuck Opportunities')]")
	public static WebElement Opp_Stuckopp;
	
	@FindBy(xpath = "//*[@id=\"quarter_q\"]/option[2]")
	public static WebElement Quart_Interval;
	
	@FindBy(xpath = "//*[@id=\"open\"]/option[1]")
	public static WebElement Quart_Include;
	
	@FindBy(name = "go")
	public static WebElement run_Report;
}


