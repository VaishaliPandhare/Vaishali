package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag1 {
	
	//To describe the method
  @Test (description = "This Method Performs Login!")
  public void method1() {
	  
	  Reporter.log("Method1 Login", true);
  }
}
