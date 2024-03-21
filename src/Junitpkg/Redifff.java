package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redifff {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before 
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void login() throws InterruptedException
	{
	Thread.sleep(3000);
	
	WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td/select[1]"));
	WebElement month=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td/select[2]"));
	WebElement year=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td/select[3]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("10");
	Select daydetails1=new Select(month);
	daydetails1.selectByValue("10");
	Select daydetails3=new Select(year);
	daydetails3.selectByValue("2024");
}
}