package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubleclickrightclick {
ChromeDriver driver;
String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
@Test
public void rightclick()throws InterruptedException
{
	Thread.sleep(1000);
	Actions act=new Actions(driver);
WebElement rightclick=driver.findElement(By.xpath("/html/body/span"));
act.contextClick(rightclick).perform();
WebElement edit=driver.findElement(By.xpath("/html/body/ul/li[1]"));
edit.click();
driver.switchTo().alert().accept();
WebElement doubleclick=driver.findElement(By.xpath("/html/body/button"));
act.doubleClick(doubleclick).perform();
Alert alert=driver.switchTo().alert();
System.out.println("alert text\n"+alert.getText());
alert.accept();
}

}
