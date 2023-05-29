package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag4 {
	
	// execute the annotation or methods according to priority
  @Test(priority = 2)
  public void a() {
	  Reporter.log("a method",true);
  }
  
  @Test(priority = 3)
  public void b()
  {
	  Reporter.log("b method",true);
  }
  
  @Test(priority = 1)
  public void c()
  {
	  Reporter.log("c method",true);
  }
  
  @Test(priority = 4)
  public void d()
  {
	  Reporter.log("d method",true);
  }
  
  @Test
  public void e()
  {
	  Reporter.log("e method",true);
  }
  
  @Test
  public void f()
  {
	  Reporter.log("f method",true);
  }
  
  @Test
  public void g()
  {
	  Reporter.log("g method",true);
  }
  
  @Test
  public void h()
  {
	  Reporter.log("h method",true);
  }
}
