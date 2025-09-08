package seleniumjavatest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login2 {
	void m1()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		String tittle = driver.getTitle();
		System.out.println(tittle);
		if(tittle.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Tittle is verified succesfully");
		}else
		{
			System.out.println("Tittle is not verified succesfully");
		}
		driver.findElement(By.name("txtUserName")).sendKeys("Pramodh");
		driver.findElement(By.name("txtPassword")).sendKeys("Abcde12345$");
		driver.findElement(By.name("Submit")).click();
		/*String text=driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
		System.out.println(text);
		if(text.equals("Welcome pramodh"))
		{
			System.out.println("Text is verified");
		}else
		{
			System.out.println("Text is not verified");
		}
		driver.switchTo().frame(0);
		WebElement dropdown=driver.findElement(By.id("loc_code"));
		List<WebElement> droplist=dropdown.findElements(By.tagName("option"));
		System.out.println("droplist:"+droplist.size());
		for(int i=0;i<droplist.size();i++)
		{
			System.out.println(droplist.get(i).getText());
		}
		//select value in dropdown
		//create select method and allow the dropdown element 
		Select s=new Select(dropdown);
		//s.selectByIndex(2);
		s.selectByValue("7");
		//switch to main window
		driver.switchTo().defaultContent();
		//logout
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
		
		driver.close();
		*/
		
		Alert alert=driver.switchTo().alert();
		String alert1=alert.getText();
		System.out.println(alert1);
		if(alert1.equals("Password not given!"))
		{
			System.out.println("alert text is verified");
		}else
		{
			System.out.println("alert text is not verified");
		}
		alert.accept();
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login2 login=new login2();
		login.m1();

	}

}
