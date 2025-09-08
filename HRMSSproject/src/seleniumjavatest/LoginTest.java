package seleniumjavatest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {
	void logintest()
	{
		//launch the Firefox browser
		WebDriver driver= new FirefoxDriver();
		//Navigate to the URL
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		//Get the title of the webpage
		String tittle = driver.getTitle();
		//Print the title of the webpage
		System.out.println(tittle);
		//verify the title of the webpage
	     if (tittle.equals("OrangeHRM - New Level of HR Management"))
	     {
	            System.out.println("Title verified successfully");
	        } else 
	        {
	            System.out.println("Title not verified");
	        }
	     //identify the username and enter the username(this is credentials)
	     driver.findElement(By.name("txtUserName")).sendKeys("pramodh");
	   //identify the username and enter the username
	     driver.findElement(By.name("txtPassword")).sendKeys("Abcde12345$");
		   //identify the loginbutton 
	     driver.findElement(By.name("Submit")).click();
	     //Welcome page
	     String text = driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
	     //print the welcome page
	     System.out.println(text);
	     if(text.equals("Welcome pramodh"))
	     {
	    	 System.out.println("Welcome page is verfied");
	     }
	     else {
	    	 System.out.println("Welcome page is not verfied");
	     }
	     //switch to frame
	     driver.switchTo().frame(0); //This one using index to switch the frame any  one can use to switch 
	     //Driver.switchTo().frame("rightMenu");// This one using index to switch the frame any  one can use to switch 
	    // Driver.switchTo().frame(Driver.findElement(By.id("rightMenu"))); //This one using webelement to switch the frame any  one can use to switch
	   // first identify the dropdown
	    WebElement dropdown = driver.findElement(By.id("loc_code"));
	    List<WebElement>droplist=dropdown.findElements(By.tagName("option"));
	     System.out.println("droplist:"+droplist.size());//9
	     for(int i=0;i<droplist.size();i=i+1)
	     {
	    	 System.out.println(droplist.get(i).getText());
	     }
	   //select value in dropdown
			//create select method and allow the dropdown element 
			Select s=new Select(dropdown);
			s.selectByIndex(2);
			
			//s.selectByValue("7");
			//Driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
			//Driver.findElement(By.id("txtEmpLastName")).sendKeys("krishna");
			//Driver.findElement(By.name("txtEmpFirstName")).sendKeys("rama1");	
			//Driver.findElement(By.id("btnEdit")).click();
			//Driver.findElement(By.xpath("/html/body/div[5]/input")).click();
			WebElement check=driver.findElement(By.name("chkLocID[]"));
			check.click();
			if(check.isSelected())
			{
				System.out.println("checkbox is selected");
			}else
			{
				System.out.println("checkbox is not selected");
			}
			//identify all the checkecboxes
			List <WebElement> allcheck=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("checboxes:"+allcheck.size());
			for(int i=1;i<allcheck.size();i++)
			{
				
				//click n checkbox one by one 
				allcheck.get(i).click();
			//	verify all the checkboxes 
			if(allcheck.get(i).isSelected())
			{
				System.out.println("checkboxes is selected");
			}else
			{
				System.out.println("checkboxes is not selected");
			}
			}
			driver.switchTo().defaultContent();
			Actions action=new Actions(driver);
			
		   action.moveToElement(driver.findElement(By.id("pim"))).perform();
		     driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/ul/li[2]/a/span")).click();
		     driver.switchTo().frame(driver.findElement(By.id("_yuiResizeMonitor")));
				//driver.findElement(By.id("txtEmpLastName")).sendKeys("hero1");
				//driver.findElement(By.id("txtEmpFirstName")).sendKeys("2");
				driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\user\\Downloads\\selenium\\Sshot.png");
			/*
			
			
			/*if(element.isDisplayed()) {
				System.out.println("pim is selected");
			}else
			{
				System.out.println("pim is not selected");
			}
			*/
			
			
			//switch to main window
			//Driver.switchTo().defaultContent();
			//logout
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTest login = new LoginTest();
		login.logintest();

	}

}
