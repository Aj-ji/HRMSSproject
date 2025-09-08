package testng1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest8 {
  @Test
  public void test8() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("jani");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("kim");
  }
  
  @Test(groups = "Smoke", priority = 4)
  public void composeMail() {
      Assert.assertEquals("OrangeHRM", "OrangeHRM");
      System.out.println("Send a Mail");
  }
  @Test(groups = "Smoke", priority = 6)
  public void deleteMail() {
      System.out.println("Delete a Mail");
  }
  @Test(groups = "Sanity", priority = 3)
  public void logout_Account() {
      System.out.println("Account Logout");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("jim");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("rum");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("rani");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("honey");
  }

}
