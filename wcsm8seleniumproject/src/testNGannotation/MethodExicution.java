package testNGannotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExicution {
  @Test
  public void method1() 
  {
	  long threadID = Thread.currentThread().getId();
	  Reporter.log(threadID +" : is the thread id of Method",true);
	  Reporter.log("method 1",true);
  }
  
  @Test
  public void method2()
  {
	  long threadID = Thread.currentThread().getId();
	  Reporter.log(threadID +" : is the thread id of method",true);
	  Reporter.log("method 2",true);
  }
}
