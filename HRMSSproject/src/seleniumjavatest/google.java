package seleniumjavatest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class google {
	void google()
	{		
		
		//launch the Firefox browser
		WebDriver Driver= new FirefoxDriver();
		Driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		/*Driver.findElement(By.name("txtUserName")).sendKeys("pramodh");
		   //identify the username and enter the username
		     Driver.findElement(By.name("txtPassword")).sendKeys("Abcde12345$");
			   //identify the loginbutton 
		     Driver.findElement(By.name("Submit")).click();*/
		        
				WebElement username=Driver.findElement(By.name("txtUserName"));
				Actions action=new Actions(Driver);
				action.sendKeys(username,"pramodh").perform();
				Driver.findElement(By.name("txtPassword")).sendKeys("Abcde12345$");
				//by using action class
				//action.click(Driver.findElement(By.name("Submit"))).perform();
				//mousehover to login
				action.moveToElement(Driver.findElement(By.name("Submit"))).perform();
				//by using keyboard method
				action.sendKeys(Keys.ENTER).perform();
				Driver.switchTo().defaultContent();
				action.moveToElement(Driver.findElement(By.id("pim"))).perform();
				Driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/ul/li[2]/a/span")).click();
				/*Driver.switchTo().frame(0);
				Driver.findElement(By.id("txtEmpLastName")).sendKeys("hero1");
				Driver.findElement(By.id("txtEmpFirstName")).sendKeys("2");
				Driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\user\\Downloads\\selenium\\Sshot.png");
				
				*/
		
				//action.moveToElement(username).perform();
				//action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
				
				//Driver.findElement(By.name("Submit")).click();
		     
		    //WebElement about= Driver.findElement(By.className("MV3Tnb"));
		    //Actions action=new Actions(Driver);
		     //action.contextClick(about).perform();
		     
		
		
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		google login = new google();
		login.google();

	}

}
