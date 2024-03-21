package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploading {
ChromeDriver driver;
String baseurl="https://demo.guru99.com/test/upload/";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void uploadfile()
{
	WebElement filechoose=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input"));
filechoose.sendKeys("C:\\Users\\s\\Desktop\\test excel\\note");

WebElement box=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/center/span/input"));
box.click();
WebElement button=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/ul/li/div[1]/button"));
button.click();
String text=button.getText();
System.out.println("button name="+text);
}
}
