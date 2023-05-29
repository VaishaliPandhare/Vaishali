package testNGpack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void d() {
	  Reporter.log("d method",true);
  }
  
  @Test
  public void e() {
	  Reporter.log("e method",true);
  }
  
  @Test
  public void f() {
	  int i=10;
	  int j=0;
	  int res=i/j;
	  System.out.println(res);
	  Reporter.log("f method",true);
  }
}
