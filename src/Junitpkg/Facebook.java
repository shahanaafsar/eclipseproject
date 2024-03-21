package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com/";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abscf");
		driver.findElement(By.name("login")).click();
	}
	@After
	
		public void exit()
		{
			driver.quit();
		}
	
}
