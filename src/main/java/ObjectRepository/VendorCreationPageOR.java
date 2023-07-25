package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorCreationPageOR {

	

	public VendorCreationPageOR(WebDriver driver2) {
		
	}

	WebDriver driver;

	//basic details page
	@FindBy (xpath = "//i [@class=\"icon icon-menu\"]")
	public WebElement HumbergerMenu;

	@FindBy (xpath = "//label [text()=\"Vendor\"]")
	public WebElement VendorOption;

	@FindBy (xpath = "//button[text()=\"Add New Vendor\"]")
	public WebElement AddNewVendor;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[1]")
	public WebElement VendorDisplayName;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[2]")
	public WebElement LegalEntityName;

	@FindBy (xpath = "(//span[@class=\"Select-arrow-zone\"])[1]")
	public WebElement ParentVendor;

	@FindBy (xpath = "//span[text()= \"Santosh Kumar Sahoo (PV-A00114)\"]")
	public WebElement ParentVendorField;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[3]")
	public WebElement Vendordisplaycode;

	@FindBy (xpath = "(//span[@class=\"Select-arrow\"])[2]")
	public WebElement organisationType;

	@FindBy (xpath = "//span[text()=\"Individual\"]")
	public WebElement OTindivitual;

	@FindBy (xpath = "//span[text()=\"Association Of Person\"]")
	public WebElement OTAssociationOfPerson;

	@FindBy (xpath = "//span[text()=\"Corporation\"]")
	public WebElement OTCorporation;

	@FindBy (xpath = "//span[text()=\"Utilities\"]")
	public WebElement OTUtilities;

	@FindBy (xpath = "//span[text()=\"Firm\"]")
	public WebElement OTFirm;
//--------------------------------------
	@FindBy (xpath = "(//span[@class=\"Select-arrow\"])[3]")
	public WebElement KYCdropdown;

	@FindBy (xpath = "//span[text() = \"Pan\"]")
	public 	WebElement selectPAN;

	@FindBy (xpath = "//span[text() = \"Driving License\"]")
	public WebElement selectDrivingLicense;

	@FindBy (xpath = "//span[text() = \"Aadhar Card\"]")
	public WebElement selectAadharCard;

	@FindBy (xpath = "//span[text() = \"Voter Card\"]")
	public WebElement selectVotercard;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[4]")
	public WebElement PANnumberandotherKYC;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[5]")
	public WebElement CIN;

	@FindBy (xpath = "//span[text()=\"Yes\"]")
	public WebElement GSTApplicableYes;

	@FindBy (xpath = "//span[text()=\"No\"]")
	public WebElement GSTApplicableNo;

	@FindBy (xpath = "(//input[@type=\"checkbox\"])[1]")
	public WebElement BusinessClarification;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[6]")
	public WebElement BillingAddressAddressLine1;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[7]")
	public WebElement BillingAddressAddressLine2;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[8]")
	public WebElement Pincode;
	//mailing address (checkbox)

	@FindBy (xpath = "(//input[@type=\"checkbox\"])[2]")
	public WebElement clickOncheckbox;

	//attention To	

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[11]")
	public WebElement nameEnter;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[12]")
	public WebElement numberEnter;

	//upload 	
	@FindBy (xpath = "(//div[text()= \"Upload\"])[2]")
	public WebElement registrationCertificate;

	@FindBy (xpath = "(//div[text()= \"Upload\"])[3]")
	public WebElement panCardAndOtherKyc;

	@FindBy (xpath = "(//div[text()= \"Upload\"])[4]")
	public WebElement Cin;

	@FindBy (xpath = "(//div[text()= \"Upload\"])[5]")
	public WebElement OthersDoc;

	@FindBy (xpath = "(//div[text()= \"Upload\"])[6]")
	public WebElement supportingDocuments;

	//Remarks(Optional)

	@FindBy (xpath = "//textarea[@class=\"rivigo-textarea\"]")
	public WebElement remarksText;

	@FindBy (xpath = "//button[text()= \"Exit\"]")
	public WebElement exit;

	@FindBy (xpath = "//button[text()= \"Save and Next\"]")
	public WebElement saveAndNext;

	//Payment details Page
	//1.Payment Method :-

	@FindBy (xpath = "(//input[@class=\"ant-radio-input\"])[1]")
	public WebElement ElectronicFundTransfer;

	@FindBy (xpath = "//(//input[@class=\"ant-radio-input\"])[2]")
	public WebElement Cheque;

	@FindBy (xpath = "//(//input[@class=\"ant-radio-input\"])[2]")
	public WebElement DD;

	@FindBy (xpath = "//(//input[@class=\"ant-radio-input\"])[3]")
	public WebElement setAsDefault;

	//AccountDetails
	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[1]")
	public WebElement accountName;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[2]")
	public WebElement accountNumber;

	@FindBy (xpath = "(//span[@class=\"Select-arrow-zone\"]")
	public WebElement AccountTypearrow;

	@FindBy (xpath = "//span[text()=\"Current\"]")
	public WebElement selectCurrent;

	@FindBy (xpath = "//span[text()=\"Saving\"]")
	public WebElement selectSaving;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[3]")
	public WebElement IFSCcode;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[4]")
	public WebElement BankName;
	//Documents Upload

	@FindBy (xpath = "(//div[@class=\"action-label\"])[1]")
	public WebElement Cancelcheque;

	@FindBy (xpath = "(//div[@class=\"action-label\"])[2]")
	public WebElement BankPassbook;

	//Remarks(optional)...addremarks


	@FindBy (xpath = "//button[text()=\"Previous\"]")
	public WebElement Previous;

	@FindBy (xpath = "//button[text()=\"Save and Next\"]")
	public WebElement SaveandNext;


	//Site 1:

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[1]")
	public WebElement SiteDisplayName;


	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[2]")
	public WebElement GSTIN;


	//Primary Address & Mailing Address	
	//Address Line 1
	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[3]")
	public WebElement Addressline1;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[4]")
	public WebElement Addressline2optional;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[5]")
	public WebElement PincodeSite1;


	//Mailing Address
	//Same as Billing Address

	@FindBy (xpath = "//input[@type=\"checkbox\"]")
	public WebElement SameasBillingAddresscheckBox;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[8]")
	public WebElement AttentionToSite1;

	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[8]")
	public WebElement ContactNumberSite1;

	//Mailing Address

	@FindBy (xpath = "//button[text()=\"+ Add Expense type\"]")
	public WebElement AddExpenseType;

	//NewExpenseType	
	@FindBy (xpath = "(//span[@class=\"Select-arrow\"])[1]")
	public WebElement Selectarrow;
	//---------------------------------------------------------
	
	@FindBy (xpath = "//span[text()=\"Fuel\"]")
	public WebElement FuelET;

	@FindBy (xpath = "//span[text()=\"Fauji\"]")
	public WebElement FaujiET;

	@FindBy (xpath = "//span[text()=\"Security\"]")
	public WebElement Security;

	@FindBy (xpath = "//span[text()=\"House Keeping\"]")
	public WebElement HouseKeeping;

	@FindBy (xpath = "//span[text()=\"BP\"]")
	public WebElement BP;

	@FindBy (xpath = "//span[text()=\"RP\"]")
	public WebElement RP;

	@FindBy (xpath = "//span[text()=\"RLH/Feeder\"]")
	public WebElement RLHorFeeder;

	@FindBy (xpath = "//span[text()=\"NLH\"]")
	public WebElement NLH;

	@FindBy (xpath = "//span[text()=\"Office Rent\"]")
	public WebElement OfficeRent;

	@FindBy (xpath = "//span[text()=\"Residential Rent\"]")
	public WebElement ResidentialRent;

	@FindBy (xpath = "//span[text()=\"Parking Rent\"]")
	public WebElement ParkingRent;

	@FindBy (xpath = "//span[text()=\"Equipment Rent\"]")
	public WebElement EquipmentRent;

	@FindBy (xpath = "//span[text()=\"Maintenance Rent\"]")
	public WebElement MaintenanceRent;
//---------------------------------------------------------
	
	@FindBy (xpath = "//span[@class=\"Select-arrow\"]")
	public WebElement TDSOptions;

	@FindBy (xpath = "//span[text()=\"TDS_194H_0375 (3.75%)\"]")
	public WebElement TDSOption1;

	//TAN
	@FindBy (xpath = "(//input[@class=\"rivigo-input\"])[10]")
	public WebElement TANnumber;

	@FindBy (xpath = "(//div[text()=\"Upload\"]")
	public WebElement TANceritificateupload;


   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[3]")
   public WebElement Paymentmode;

   @FindBy (xpath = "//span[text()=\"EFT-KKBK-7888-2\"]")
   public WebElement Paymentmodenumber;
   
 //VendorPOC
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[4]")
   public WebElement POCExecutive;
   
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[4]")
   public WebElement POCName;
   
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[4]")
   public WebElement POCEmail;
   
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[4]")
   public WebElement POCContactname;
   
   //RivigoFinancePOC
   
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[1]")
   public WebElement ExpTypeFinDropdown;
 
 //---------------------------------------------------------
  
 //select Expense type one by one from dropdown  
   @FindBy (xpath = "//span[text()=\"BP\"]")
   public WebElement BPFinance;
   
   @FindBy (xpath = "//span[text()=\"RP\"]")
   public WebElement RPFinance;
   
   @FindBy (xpath = "//span[text()=\"Fuel\"]")
   public WebElement FuelFinance;
   
   @FindBy (xpath = "//span[text()=\"Fauji\"]")
   public WebElement FaujiFinance;

   
   
   //Security
   //House Keeping
   //RLH/Feeder
   //Residential Rent
	//Parking Rent
	//Equipment Rent
	//Maintenance Rent
 //---------------------------------------------------------
   
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[2]")
   public WebElement POCNameFinanceEmail;
   
   @FindBy (xpath = "(//span[@class=\"Select-arrow\"])[3]")
   public WebElement LevelFinanceDropdown;
//Levels 1 to 5
   
   @FindBy (xpath = "//span[text()=\"1\"]")
   public WebElement Level1;
   
   @FindBy (xpath = "//span[text()=\"2\"]")
   public WebElement Level2;
   
   @FindBy (xpath = "//span[text()=\"3\"]")
   public WebElement Level3;
   
   @FindBy (xpath = "//span[text()=\"4\"]")
   public WebElement Level4;
   
   @FindBy (xpath = "//span[text()=\"5\"]")
   public WebElement Level5;
   
   
 //Rivigo Operations POCs
   
   
   
   
   
   
   
 //span[text()="2"]
  
   //ExpTypeFinDropdown
   
   
   
   
   
}
   
//   (//span[@class="Select-arrow"])[1]
   
		   
		 //span[text()="BP"]
   
   
   
 //input[@class="rivigo-input"]
   
   //(//input[@class="rivigo-input"])[11]
	//	   (//input[@class="rivigo-input"])[12]
		//		   (//input[@class="rivigo-input"])[13]
   
   

 
	

	

            //(//span[@class="Select-arrow"])[4]
			//(//span[@class=\"Select-arrow\"])[1]
			//(//span[@class=\"Select-arrow\"])[2]
			//(//span[@class=\"Select-arrow\"])[3]

























































