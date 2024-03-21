package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class Assertionfacebook {
ChromeDriver driver;
String baseurl="https://www.facebook.com";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void title()
{
	String exp="Facebook";
	String actual=driver.getTitle();
	Assert.assertEquals(exp, actual);
	
	System.out.println("test1");
}
}
