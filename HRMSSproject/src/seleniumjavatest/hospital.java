package seleniumjavatest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class hospital {
	void p1() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/");
		String title=driver.getTitle();
		if(title.equals("Kosmik Hospital Management System"))
		{
			System.out.println("Tittle is verified");
		}else
		{
		System.out.println("Tittle is not verified");
		}
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/ul/li[1]/a")).click();
		
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.className("photo"))).perform();
		Runtime.getRuntime().exec("C:\\Users\\user\\Downloads\\Fileupload1.exe");
		
		//driver.findElement(By.className("photo")).sendKeys("C:\\Users\\user\\Downloads\\Passport pic.jpg");
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		hospital h1=new hospital();
		h1.p1();

	}

}
