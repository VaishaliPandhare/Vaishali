package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/a2z/Desktop/WCSM8/MultipleSelectDropdown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		for(int i=0;i<=6;i++)
		{
			if(i%2==0)
			{
				Thread.sleep(2000);
				sel.selectByIndex(i);
			}
		}
		Thread.sleep(2000);
		sel.deselectByIndex(2);
	}

}
