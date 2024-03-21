package Junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallinkvalidation {

	
	String baseurl="https://www.google.com";
	ChromeDriver driver;
	@Before
	public void body()
	{
 driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linktest()
	{
		List <WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total link count="+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			Verify(link);
		}
	}
	private void Verify(String link) {
	try {
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("response code 200--successful");
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("response code 404--is broken link");
		}
		else
		{
			System.out.println("not expected");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		
	}

