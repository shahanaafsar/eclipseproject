package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	 ChromeDriver driver;
	 String baseurll="https://www.amazon.in";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurll);
		//driver.manage().window().maximize();)
	}
	@Test
	public void pagetest() throws InterruptedException
	{
		Thread.sleep(4000);
	WebElement amazonsearch= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			amazonsearch.sendKeys("mobiles",Keys.ENTER);
	
driver.findElement(By.xpath("//div[@id='nav-xshop']")).click();
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
driver.navigate().back();
driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
driver.findElement(By.xpath("//a[@id='icp-nav-flyout']")).click();
driver.findElement(By.xpath("//span[@id='icp-cancel-button']/span/a")).click();

driver.findElement(By.xpath("//a[@id='nav-orders']/span[1]")).click();
	}
}
