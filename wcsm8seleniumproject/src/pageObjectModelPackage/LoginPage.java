package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Record all the WebElements of LoginPage by using 
	//@FindBy Annotation
	
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="pwd") private WebElement passwordTB;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(xpath="//input[@name='remember']") private WebElement checkBox;
	@FindBy(linkText="Actimind Inc.") private WebElement actiMindLink;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	//utilization
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	// Operational Methods
	
	public void validLogin(String validUsername, String validPassword) throws InterruptedException
	{
		usernameTB.sendKeys(validUsername);
		Thread.sleep(2000);
		passwordTB.sendKeys(validPassword);
		Thread.sleep(2000);
		loginbutton.click();
	}
}
