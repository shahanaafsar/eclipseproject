package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mypage {

	ChromeDriver driver;
	String baseurl="file:///C:/Users/s/Desktop/test%20excel/java/webpage.html";
	@ Before
	public void body()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void webpage()throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shahana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sha");
		
	}
}
