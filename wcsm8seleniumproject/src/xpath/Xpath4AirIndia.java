package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath4AirIndia {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa, Dabolim Airport, GOI, India, IN");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@title='Departing']")).click();
		driver.findElement(By.xpath("//input[@title='Departing']")).sendKeys("10/04/2023");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@title='Returning']")).click();
		driver.findElement(By.xpath("//input[@title='Returning']")).sendKeys("20/05/2023");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//select[@title='Aged 12 and over']")).click();
		driver.findElement(By.xpath("//select[@title='Aged 12 and over']")).sendKeys("4");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//select[@title='Aged 2-11 years old']")).click();
		driver.findElement(By.xpath("//select[@title='Aged 2-11 years old']")).sendKeys("1");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//select[@title='Infants must be below the age of 2 years before the completion of a One Way/Return journey, or you will need to use the Child option for proceeding further with the booking. You may also choose to contact the local Air India office for the issuance of such tickets.']")).sendKeys("1");
		driver.findElement(By.xpath("//select[@title='Infants must be below the age of 2 years before the completion of a One Way/Return journey, or you will need to use the Child option for proceeding further with the booking. You may also choose to contact the local Air India office for the issuance of such tickets.']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//select[@title='Concessionary Type']")).click();
		driver.findElement(By.xpath("//select[@title='Concessionary Type']")).sendKeys("Student");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//option[@value='Economy']")).click();
		driver.findElement(By.xpath("//option[@value='Economy']")).sendKeys("Premium Economy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Promotion Code']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Promotion Code']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Promotion Code']")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();
	}

}
