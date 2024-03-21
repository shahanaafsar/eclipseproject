package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest {
WebDriver driver;
		@BeforeTest
		public void setuo()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
		@Test
		public void testlogin()
		{
			Fbloginpage ob=new Fbloginpage(driver);
			ob.setvalues("zxcvbnm@gmail.com", "asdfgh");
			ob.login();
		}

}
