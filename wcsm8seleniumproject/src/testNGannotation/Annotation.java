package testNGannotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
  @Test
  public void f() {
	  Reporter.log("f", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforeMethod annotation", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("afterMethod annotation", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("beforeClass annotation", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("afterClass annotation", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("beforeTest annotation", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("afterTest annotation", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite annotation", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite annotation", true);
  }
  
  @Test
  public void testMethod2()
  {
	  Reporter.log("Test Annotation2",true);
  }

}
