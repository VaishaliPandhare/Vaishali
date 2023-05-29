package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationFlag3 {
	// use to execute annotation or method multiple times!! 
  @Test(invocationCount = 10)
  public void method1() {
	  Reporter.log("Login Test Case!!",true);
  }
}
