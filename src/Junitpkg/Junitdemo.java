package Junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {

	ChromeDriver driver;
	String baseurl="https://shop.aerofil.in";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void titleverification()
	{
		String exp="aerofil online store";
		String actualtitle=driver.getTitle();
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void exit()
	{
	driver.quit();
	}
}
