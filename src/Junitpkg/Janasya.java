package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {

	
	ChromeDriver driver;
	String baseurl="https://janasya.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void janasya()throws InterruptedException
	{
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
		WebElement janasyasearch=driver.findElement(By.xpath("//div[@id='shopify-section-sections--16282719912106__0551e2c3-4916-467e-a6e9-b0d8594a3ff3']/header/div/div/div[3]/div/details-modal /predictive-search/details/summary/form/div[1]/input"));
		janasyasearch.sendKeys("ethnic",Keys.ENTER);
		
		List<WebElement>linklist1=driver.findElements(By.tagName("a"));
		System.out.println(linklist1.size());
		List<WebElement>linklist11=driver.findElements(By.tagName("a"));
		for(WebElement divlink:linklist11) {
			System.out.println(divlink.getText()+"-"+divlink.getAttribute("href"));
		}
		
	}
}
