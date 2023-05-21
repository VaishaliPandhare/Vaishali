package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchoToMethodAndNavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 //will launch web application by using navigate method
		 
		 driver.navigate().to("https://www.google.com/");
		 Thread.sleep(2000);
		 //switch the control to active element
		 
		 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		 
	}

}
