package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest5 {
	@Test(groups = "Smoke", priority = 0)
    public void login_Account() {
        System.out.println("Account Login");
    }
    @Test(groups = "Smoke", priority = 2)
    public void checkMail() {
        Assert.assertEquals("OrangeHRM", "OrangeHRM");    
        System.out.println("Checking Mail in the Inbox");
    }
    @Test(groups = "Sanity", dependsOnMethods="checkMail", priority = 1)
    public void checkDrafts() {
        System.out.println("Checking Drafts");
    }

}


