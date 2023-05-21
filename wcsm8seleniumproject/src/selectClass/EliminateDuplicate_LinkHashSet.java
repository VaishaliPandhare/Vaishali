package selectClass;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate_LinkHashSet {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/a2z/Desktop/WCSM8/SingleSelectDropdown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		List<WebElement> allOptions = sel.getOptions();
		LinkedHashSet<String> linkHash = new LinkedHashSet<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			String op = allOptions.get(i).getText();
			linkHash.add(op);
		}
		for(String options:linkHash)
		{
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}
