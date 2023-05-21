package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//to avoid illegal state exception
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeOptions Eo =new EdgeOptions();
		//to avoid connection failed exception
		Eo.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
}

