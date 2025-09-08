package seleniumjavatest;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kosmik {
	void m1()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/");
		String tittle=driver.getTitle();
		if(tittle.equals("Kosmik Hospital Management System"))
		{
			System.out.println("tittle verified successfly");
		}else
		{
			System.out.println("tittle not verified successfly");
		}
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/div/h3/a")).click();
		driver .findElement(By.xpath("/html/body/div[2]/div/div[1]/ul/li[3]/a")).click();
		Set <String>all_windows=driver.getWindowHandles();
		System.out.println("all_windowss:"+all_windows.size());
	    ArrayList<String> alist=new ArrayList<String>(all_windows);
	    driver.switchTo().window(alist.get(1));
	    //driver.findElement(By.xpath("/html/body/div[2]/div/h3/a"));
	    //driver.close();
	    driver.findElement(By.id("name")).sendKeys("kosmik");
	    try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.xpath("/html/body/div[2]/div/h3/a"));
	    driver.quit();
	    
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kosmik k = new kosmik();
		k.m1();

	}

}
