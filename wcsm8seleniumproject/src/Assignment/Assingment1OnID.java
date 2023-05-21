package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Assingment1OnID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("userLoginId")).sendKeys("abcd@123");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("abcde");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	}
}
