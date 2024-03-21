package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcountfacebook {
ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	
	@Before
	
		public void setup()
		{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkcount()
	{
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks) {
			System.out.println(link.getText()+"-"+link.getAttribute("href"));}
		
		
		
		List<WebElement>linklist1=driver.findElements(By.tagName("link"));
		System.out.println(linklist1.size());
		List<WebElement>linklist11=driver.findElements(By.tagName("a"));
		for(WebElement divlink:linklist11) {
			System.out.println(divlink.getText()+"-"+divlink.getAttribute("href"));
		}
		}
	}


