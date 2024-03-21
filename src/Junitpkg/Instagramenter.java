package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramenter {
	
	ChromeDriver driver;
	String baseurl="https://www.instagram.com/";
	@Before 
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.name("username"));
		search.sendKeys("qwerty",Keys.ENTER);
		WebElement search1=driver.findElement(By.name("password"));
		search1.sendKeys("asdd",Keys.ENTER);
		
	}

}
