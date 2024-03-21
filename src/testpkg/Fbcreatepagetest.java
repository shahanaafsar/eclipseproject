package testpkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;
import pagepkg.Fbcreatepage;



public class Fbcreatepagetest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}

@Test
public void testcreatepage()
{
	Fbcreatepage ob= new Fbcreatepage(driver);
	
	ob.createclick();
	ob.signupclick();
	String actual=ob.titleverification();
	Assert.assertEquals(actual, "Sign up for Facebook | Facebook");
	
}
}
