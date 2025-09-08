package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalelNewTest {
	
	public WebDriver driver;
    @Parameters({"browserType"})
    @BeforeClass
    public void setup(String browserType) {
        switch (browserType) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\selenium\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\selenium\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
                
           
            default:
                System.out.println("Invalid browser choice");
        }
        driver.manage().window().maximize();
        driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
    }
    // Both of the following tests will be executed in all specified browsers
    @Test
    public void verify_title() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
        System.out.println("Title is fine.");
    }
    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
