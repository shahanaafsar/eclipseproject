package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandling {

	
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/popup.php";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);	
		
	}
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();//current window
		System.out.println("parent window tittle="+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String>allwindowhandles =driver.getWindowHandles();
		for(String handle:allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("dfgh@gmail.com");
			driver.close();
			}
		}driver.switchTo().window(parentwindow);
		//driver.close();
	}
}
