package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class LaunchChromeOptions {

	public static void main(String[] args) {
		// to launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions Co=new ChromeOptions();
		
		Co.addArguments("--remote-allow-origins=*");
		
		new ChromeDriver(Co);
	}

}
