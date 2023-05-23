package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
  public void g() {
	  Reporter.log("g method",true);
  }
  
  @Test
  public void h() {
	  Reporter.log("h method",true);
  }
  
  @Test
  public void i() {
	  Reporter.log("i method",true);
  }
}
