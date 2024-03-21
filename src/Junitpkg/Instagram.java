package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

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
	Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("sdf@gmial.com");
	    driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("asdfg");
driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).submit();
	}
	
}
