package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	ChromeDriver driver;
	String base="https://www.google.com/";
	
	@ Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(base);
	}
	
	@Test
	public void gooogletest()
	{
		//driver.findElement(By.name("q")).sendKeys("book");;
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Book",Keys.ENTER);
	}
}
