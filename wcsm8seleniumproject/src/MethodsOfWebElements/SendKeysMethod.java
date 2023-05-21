package MethodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=cidgr861e321");
		WebElement usernameTB = driver.findElement(By.name("username"));
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		usernameTB.sendKeys("admin123");
		passwordTB.sendKeys("manager123");
	}

}
