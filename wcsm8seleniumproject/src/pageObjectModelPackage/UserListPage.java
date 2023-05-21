package pageObjectModelPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserListPage {
	
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createUser;
	@FindBy(xpath = "//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath ="//*[@name='passwordTextRetype']") private WebElement passwordTBRetype;
	@FindBy(xpath ="//*[@name='firstName']") private WebElement firstName;
	@FindBy(xpath ="//*[@name='lastName']") private WebElement lastName;
	@FindBy(xpath ="//*[@name='workdayDurationStr']") private WebElement workdayDurationStr;
	@FindBy(xpath ="//input[@type='submit']") private WebElement CreateUser;
	
	
}