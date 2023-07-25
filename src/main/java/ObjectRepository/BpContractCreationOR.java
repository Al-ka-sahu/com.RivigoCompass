package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BpContractCreationOR {


		
		WebDriver Driver;
		
		@FindBy (xpath="//button[text()=\"Add New Contract\"]")
		public WebElement AddNewContract;
		
		@FindBy (xpath = "//a[text()=\"BP\"]")
		public WebElement SelectBP;
		
		@FindBy (xpath = "(//div[text()=\"Select...\"])[1]")
		public WebElement EnterVendorCode;
		
	
		

//Vendor code = //div[@class="Select is-searchable Select--single"]		
		
		
	}


