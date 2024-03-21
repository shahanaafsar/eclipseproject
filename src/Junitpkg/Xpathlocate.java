package Junitpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocate {

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
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abscf");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
}

	

