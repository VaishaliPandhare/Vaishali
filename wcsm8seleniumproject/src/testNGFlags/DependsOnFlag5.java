package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnFlag5 {
	
  @Test(description = "Login TestCase")
  public void loginMehtod() {
	  Reporter.log("login perform!!",true);
  }
  
  @Test(description = "CreateUser TestCase",dependsOnMethods = "loginMehtod")
  public void createUser() {
	  Reporter.log("user created!!",true);
  }
  
  @Test(description = "LogOut TestCase",dependsOnMethods = "createUser")
  public void logOut() {
	  Reporter.log("logout perform!!",true);
  }
}
