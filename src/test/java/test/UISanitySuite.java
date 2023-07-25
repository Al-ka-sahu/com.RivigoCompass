package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import ObjectRepository.CompassLoginPageOR;
import ObjectRepository.VendorCreationPageOR;
import Utilities.BaseclassUI;

public class UISanitySuite extends BaseclassUI
{
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
		//report = new ExtentReports("//home//rivigo//eclipse-workspace//Rivigo_Zoom//extentReport//expensereport2.html",true);
		//report = new ExtentReports("",true);

		report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReport/ExtentReportResults2.html",true);

		test = report.startTest("Test1");
}


	@Test (priority=1,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void compassLoginTest() throws InterruptedException {

		driver.get("https://financeui-dev.stg.rivigo.com/search");
		test.log(LogStatus.INFO,"opencompassURL");
		CompassLoginPageOR login = new CompassLoginPageOR(driver);
		login.inp_enteruserName("alka.sahu@rivigo.com");
		test.log(LogStatus.INFO,"enterusername");
		login.inp_enterpasswordName("Aug@123!");
		test.log(LogStatus.INFO,"enterpasswordname");
		login.inp_clickOnLoginButton();
		test.log(LogStatus.INFO,"click on login button");
		Thread.sleep(2000);

		VendorCreationPageOR MenuPage = new VendorCreationPageOR(driver);
		boolean actual = MenuPage.HumbergerMenu.isDisplayed();
		Thread.sleep(3000);
		Assert.assertEquals(actual, true);



	}

	@Test (priority=2,retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void VendorCreationTest() throws InterruptedException
	{

		VendorCreationPageOR MenuPage= new VendorCreationPageOR (driver);
		MenuPage.HumbergerMenu.click();
		Thread.sleep(5000);
		MenuPage.VendorOption.click();
		Thread.sleep(5000);
		MenuPage.AddNewVendor.click();
		Thread.sleep(5000);
		MenuPage.VendorDisplayName.sendKeys("RamPrakash");
		Thread.sleep(5000);
		MenuPage.LegalEntityName.sendKeys("RamPrakash1");
		Thread.sleep(5000);
		MenuPage.ParentVendor.click();
		Thread.sleep(5000);
		MenuPage.ParentVendorField.click();
		Thread.sleep(5000);
		MenuPage.ParentVendorField.click();
		Thread.sleep(5000);
		MenuPage.Vendordisplaycode.sendKeys("ravi01");
		Thread.sleep(5000);
		MenuPage.organisationType.click();
		Thread.sleep(5000);
		MenuPage.OTindivitual.click();
		Thread.sleep(5000);
		//OTAssociationOfPerson
		//OTCorporation
		//OTUtilities
		MenuPage.KYCdropdown.click();
		Thread.sleep(5000);
		MenuPage.selectPAN.click();
		Thread.sleep(5000);
		MenuPage.PANnumberandotherKYC.sendKeys("KYGYH7876Y");
		Thread.sleep(5000);
		//MenuPage.CIN.click();
		MenuPage.GSTApplicableYes.click();
		Thread.sleep(5000);
		MenuPage.BusinessClarification.click();
		Thread.sleep(5000);
		MenuPage.BusinessClarification.click();
		Thread.sleep(5000);
		MenuPage.BillingAddressAddressLine1.sendKeys("H no. 11, Shayama prasad mukharji ward, delhi");
		Thread.sleep(5000);
		MenuPage.BillingAddressAddressLine2.sendKeys("H no. 11, Shayama prasad mukharji ward, delhi");
		Thread.sleep(5000);
		MenuPage.Pincode.sendKeys("110011");
		Thread.sleep(5000);
		//mailing address (checkbox)
		MenuPage.clickOncheckbox.sendKeys("110011");
		Thread.sleep(5000);

		//attention To
		MenuPage.nameEnter.sendKeys("Alka Sahu");
		Thread.sleep(5000);

		MenuPage.numberEnter.sendKeys("7987414879");
		Thread.sleep(5000);
		//	upload 
		MenuPage.registrationCertificate.sendKeys("");
		Thread.sleep(5000);

		MenuPage.panCardAndOtherKyc.sendKeys("");
		Thread.sleep(5000);

		MenuPage.Cin.sendKeys("");
		Thread.sleep(5000);

		MenuPage.OthersDoc.sendKeys("");
		Thread.sleep(5000);

		MenuPage.supportingDocuments.sendKeys("");
		Thread.sleep(5000);

		//Remarks(Optional)  	
		MenuPage.remarksText.sendKeys("not any other documents required");
		Thread.sleep(5000);

		MenuPage.exit.click();
		Thread.sleep(5000);

		MenuPage.saveAndNext.click();
		Thread.sleep(5000);

	}


	@AfterClass

	public static void endTest()
	{
		report.endTest(test);
		report.flush();

	}

}
