package seleniumjavatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleartrip {
	void m1()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mdbootstrap.com/docs/standard/components/modal/#docsTabsOverview");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("accept_cookies_btn")).click();
		
		
			driver.findElement(By.xpath("/html/body/header/nav/div/span/ul/li[8]/a[2]")).click();
			driver.findElement(By.xpath("/html/body/header/span/div/div/div/div[2]/button")).click();
	
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cleartrip ctrip=new cleartrip();
		ctrip.m1();

	}

}
