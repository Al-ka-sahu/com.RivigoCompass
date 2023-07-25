package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VendorFilterStatusOR {

	WebDriver driver;

	//VendorStatus--------		
	@FindBy (xpath = "//span[@class=\"Select-arrow\"]")
	WebElement Filterdropdown;

	@FindBy (xpath = "//span[text()=\"Active\"]")
	WebElement Active;
	@FindBy (xpath = "//span[text()=\"Pending for Approval\"]")
	WebElement PendingforApproval;
	@FindBy (xpath = "//span[text()=\"Drafted\"]")
	WebElement Drafted;
	@FindBy (xpath = "//span[text()=\"Merged\"]")
	WebElement Merged;


	@FindBy (xpath = "//button[text()=\"Apply\"]")
	WebElement Applybutton;

	//AddFilter -----------

	@FindBy (xpath = "//button[text()=\"Add Filter\"]")
	WebElement AddFilter01;

	@FindBy (xpath = "//span[@class=\"Select-arrow\"])[2]")
	WebElement AddFilterDropdownarrow1;

	@FindBy (xpath = "//button[text()=\"Add Filter\"]")
	WebElement selectVendorDisplayName;

	@FindBy (xpath = "(//div[text()=\"Select...\"])[1]")
	WebElement selectVendor;

	@FindBy (xpath = "//button[text()=\"Apply\"]")
	WebElement Apply1;
	//--------------OR------------------

	@FindBy (xpath = "(//button[@type=\"button\"])[1]")
	WebElement deletebutton1;

	//ParentVendor----------------------------

	@FindBy (xpath = "//button[text()=\"Add Filter\"]")
	WebElement AddFilter02;

	@FindBy (xpath = "//span[@class=\"Select-arrow\"])[3]")
	WebElement AddFilterDropdownarrow2;

	@FindBy (xpath = "//button[text()=\"Add Filter\"]")
	WebElement selectParentVendorCode;

	@FindBy (xpath = "(//div[text()=\"Select...\"])[2]")
	WebElement selectParentVendor;

	@FindBy (xpath = "//button[text()=\"Apply\"]")
	WebElement Apply2;
	//-----------OR-----------------
	@FindBy (xpath = "(//button[@type=\"button\"])[2]")
	WebElement deletebutton2;
	//Expense Type ------------------------	

	@FindBy (xpath = "//button[text()=\"Add Filter\"]")
	WebElement AddFilter03;

	@FindBy (xpath = "//span[@class=\"Select-arrow\"])[4]")
	WebElement AddFilterDropdownarrow3;

	@FindBy (xpath = "//button[text()=\"Add Filter\"]")
	WebElement ExpenseType;

	@FindBy (xpath = "(//div[text()=\"Select...\"])[3]")
	WebElement selectET;
	
	@FindBy (xpath = "//span[text()=\"BP\"]")
	WebElement BP;
	
	@FindBy (xpath = "//span[text()=\"Fuel\"]")
	WebElement Fuel;
	
	@FindBy (xpath = "//span[text()=\"Fauji\"]")
	WebElement Fauji;
	
	@FindBy (xpath = "//span[text()=\"RP\"]")
	WebElement RP ;
	
	@FindBy (xpath = "//span[text()=\"NLH\"]")
	WebElement NLH;
	
	@FindBy (xpath = "//span[text()=\"RLH/Feeder\"]")
	WebElement RLHandFeeder;
	
	@FindBy (xpath = "//span[text()=\"Office Rent\"]")
	WebElement OfficeRent;
	
	@FindBy (xpath = "//button[text()=\"Apply\"]")
	WebElement Apply3;
	
	

//-----------OR-----------------
	@FindBy (xpath = "(//button[@type=\"button\"])[3]")
	WebElement deletebutton3;

	






}


