package testng;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
ChromeDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod(alwaysRun=true)
	public void urlloading()
	{
		driver.get(baseurl);
	}
	@Test(groups= {"smoke"})
	public void logo()
	{
		boolean logo=driver.findElement(By.xpath("/html/body/center/form/div/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
			}
		else
		{
		System.out.println("not dispalyed");	
		}
	
	}
	@Test(groups= {"smoke","sanity"})
	public void titleverification()
	{
		String exp="rediff.com";
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
	@Test(groups= {"sanity"})
	public void fullnamefield()
	{
		String src=driver.getPageSource();
		if(src.contains("Full Name"))
		{
			System.out.println("full name is displayed");
			}
		else
		{
		System.out.println("not dispalyed");	
		}
	
	}
	@Test(groups= {"smoke","sanity"})
	public void createaccountenable()
	{
		boolean createacct=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		if(createacct)
		{
			System.out.println("button is enable");
			}
		else
		{
		System.out.println("disable");	
		}
	}
  @Test(groups= {"regression"})
  public void buttontext()
  {
	 WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		if(button.getAttribute("value").matches("Create my account >>"))
				{
			System.out.println("button is enable");
			}
		else
		{
		System.out.println("disable");	
		}
  }
  @After
	
	public void exit()
	{
		driver.quit();
	}
}

