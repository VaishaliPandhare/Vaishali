package ActionsClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/downloads/");

		WebElement target = driver.findElement(By.linkText("4.9.1"));

		// to perform Mouse Action we need to create obj..
		Actions act = new Actions(driver);
		// to use Right Click Action...
		//  act.contextClick(target).build().perform();.... way 1

		act.contextClick(target).perform();   //.... way 2
		Thread.sleep(2000);
		driver.quit();
	}

}
