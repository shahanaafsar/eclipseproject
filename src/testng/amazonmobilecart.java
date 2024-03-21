package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonmobilecart {
 ChromeDriver driver;
 String baseurl="https://www.amazon.in/";
 @BeforeTest
 public void setup()
 {
	 driver=new ChromeDriver();
	 driver.get(baseurl);}
 
	 @Test
	 public void mobile() throws InterruptedException
	 {
		 driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	 search.sendKeys("mobiles",Keys.ENTER);
	 String title="/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input";
	 System.out.println("title="+driver.getTitle());
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	
	 Set<String>allwindowhandles=driver.getWindowHandles();
	 for(String handle:allwindowhandles)
		 if(!handle.equalsIgnoreCase(title))
		 {
			 driver.switchTo().window(handle);
		 }
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	
	 js.executeScript("window.scrollBy(0,250)"); Thread.sleep(1000);
	 driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();

	 driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[1]")).click();
	 
	 
	 }
 }

