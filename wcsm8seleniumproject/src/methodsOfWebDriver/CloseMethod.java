package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//illegal state exception
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//connection failed exception
		 ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		//upcasting
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.close();
	}
}
