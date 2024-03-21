package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogopresent {
ChromeDriver driver;
String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
@Before 
public void body()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void logo()
{
	
	
	//boolean logo=driver.findElement(By.xpath("//div[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
boolean radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]")).isSelected();
	if(radiobutton)
{
	System.out.println("rb is displayed");
	}
else
{
System.out.println("not dispalyed");	
}
}



}
