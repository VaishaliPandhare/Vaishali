package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void a() {
	  Reporter.log("a method",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("b method",true);
  }
  
  @Test
  public void c() {
	  Reporter.log("c method",true);
  }
}
