package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Justdial {

	ChromeDriver driver;
	String baseurl="https://www.justdial.com/";
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
	}
	@Test
	public void test()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
}
/////chromepopup removal.. not app popup