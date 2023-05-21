package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaLoginPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//img[@alt='Login icon']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[text()='Enrol Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaishalipandhare1711@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Send verification code']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='New Password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("Vaishali@123");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='Confirm New Password']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Confirm New Password']")).sendKeys("Vaishali@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Given Name']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Given Name']")).sendKeys("Vaishali");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Given Name']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Pandhare");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='day']")).click();
		driver.findElement(By.xpath("//select[@class='day']")).sendKeys("17");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='month']")).click();
		driver.findElement(By.xpath("//select[@class='month']")).sendKeys("7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@class='year']")).click();
		driver.findElement(By.xpath("//select[@class='year']")).sendKeys("2023");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='continue']")).click();
	}
}
