package dynamicScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {
	static WebDriver driver;

	@BeforeTest
	public void property() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://desktop-1topel2/login.do");
		String actualLoginPageTitle = driver.getTitle();

		//apply soft assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualLoginPageTitle,"I Don't Know");
		sa.assertAll();
	}
	@Test
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));

		//apply hard assert
		if (loginButton.isDisplayed()) {

			Assert.assertEquals(true, false);
			loginButton.click();
		}
		else {
			Reporter.log("Exception!!",true);
		}
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle,"actiTime - Enter Time-Track");
		driver.findElement(By.linkText("Logout")).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
