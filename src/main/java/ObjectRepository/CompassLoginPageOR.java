package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompassLoginPageOR {

	WebDriver driver;                      //global variable


	@FindBy (xpath="//input[@id=\"login-username\"]")
	private WebElement username;

	@FindBy (xpath = "//input[@id=\"login-password\"]")
	private WebElement Password;

	@FindBy (xpath = "//button[@id=\"login\"]")
	private WebElement loginButton;

	public CompassLoginPageOR(WebDriver driver) {           //constructor

		PageFactory.initElements(driver, this);           //this denote to global variables

	}

	public void inp_enteruserName(String UN) {       //parametrized method 
		username.sendKeys(UN);
	}
	public void inp_enterpasswordName(String PW) {
		Password.sendKeys(PW);
	}
	public void inp_clickOnLoginButton() {
		loginButton.click();

	}
}

