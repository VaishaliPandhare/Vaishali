package MethodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=cidgr861e321");
	    WebElement usernameTB = driver.findElement(By.name("username"));
	    usernameTB.sendKeys("admin");
	    Thread.sleep(2000);
	    usernameTB.clear();
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys("manager");
	    passwordTB.clear();
}

}
