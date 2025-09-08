package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void verifytitleofwebpage() {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title,"OrangeHRM - New Level of HR Management");
  }
  @BeforeClass
  public void openbrowser() {
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
  }

  @AfterClass
  public void closebrowser() {
	  driver.close();
  }

}
