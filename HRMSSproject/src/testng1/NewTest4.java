package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest4 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"rangeHRM - New Level of HR Management");
  }
  @BeforeClass
  public void browsers() {
	  driver=new FirefoxDriver();
  }

  @AfterClass
  public void close() {
	  driver.close();
  }

}
