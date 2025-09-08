package seleniumjavatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ecommerce {
	void m1()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.findElement(By.tagName("button"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ecommerce E = new ecommerce();
		E.m1();

	}

}


