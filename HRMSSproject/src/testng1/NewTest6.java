package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest6 {
  
  @Test(groups = "Sanity", priority = 1)
  public void checkPromotions() {
      System.out.println("Checking Promotions");
  }
  @Test(groups = "Sanity", priority = 2)
  public void checkAccountDetails() {
      System.out.println("Checking Account Details");
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

  
}
