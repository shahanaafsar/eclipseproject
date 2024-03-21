package testng;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationsitevalidation {

ChromeDriver driver=new ChromeDriver();
	String baseurl="https://automationexercise.com/login";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void link()
	{
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("shahana852@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("shahana");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		String exp=	"https://automationexercise.com/";
		String actual= driver.getCurrentUrl();
		if(exp.equals(actual))
		{
			System.out.println("validated");
		}
		else
		{
			System.out.println("invalid");
		}
		driver.quit();
	}	
	
	
	
	

}
