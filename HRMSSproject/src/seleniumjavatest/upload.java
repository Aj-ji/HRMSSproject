package seleniumjavatest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class upload {
	void m1() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		 driver.findElement(By.name("txtUserName")).sendKeys("pramodh");
		     driver.findElement(By.name("txtPassword")).sendKeys("Abcde12345$");
			   //identify the loginbutton 
		     driver.findElement(By.name("Submit")).click();
		     Actions action=new Actions(driver);
		     action.moveToElement(driver.findElement(By.id("pim"))).perform();
		     driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/ul/li[2]/a/span")).click();
		     driver.switchTo().frame(0);
		     //here give the sleep time of 5 seconds to load the data
		     try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    
		     //to click the Browse button in orange hrm(2 method)
		   action.click(driver.findElement(By.id("photofile"))).perform();
		     try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     Runtime.getRuntime().exec("C:\\Users\\user\\Downloads\\selenium\\Fileupload.exe");
		     
		     
		     
		     
		     
		     
		     //sendKeys("C:\\Users\\user\\Downloads\\Passport pic.jpg");
		     //driver.findElement(By.id("txtEmpLastName")).sendKeys("hanuman");
		     // String text=driver.findElement(By.xpath("/html/body/form/div/div[1]/div[2]/div[1]/h2")).getText();
		    // if(text.equals("PIM : Add Employee"))
		    	 // {
		    	 //System.out.println("text is verified") ;
		    	// }else
		    	 //{
		    	 //	 System.out.println("text is not verified") ;
		    	 //}
		     // driver.switchTo().defaultContent();
		     //try {
		     //Thread.sleep(5000);
				//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
		     //logout
		    // driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
		     
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		upload up=new upload();
		up.m1();

	}

}
