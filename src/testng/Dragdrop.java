package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {

	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void dragdrop()
	{
		WebElement from=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
		
		WebElement account=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
	WebElement from1=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
		
	WebElement amount=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
	WebElement sales=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
	WebElement account2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement am5=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement am5to=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	
	Actions act=new Actions(driver);
	act.dragAndDrop(from, account);
	act.dragAndDrop(from1, amount);
	act.dragAndDrop(sales, account2);
	act.dragAndDrop(am5, am5to);
	act.perform();
	
	if(driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed())
	{
		System.out.println("perfect displayed");
	}


	else
	{
		System.out.println("not displayed");
	}
	}
}
