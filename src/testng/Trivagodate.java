package testng;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivagodate {
ChromeDriver driver;
String baseurl="https://www.trivago.in";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	 driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
}
@Test
public void trivagodate()
{
	driver.navigate().refresh();	
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span")).click();
while(true)
{
WebElement month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"))	;
String monthdisplay=month.getText();
System.out.println(monthdisplay);

if(monthdisplay.equalsIgnoreCase("june 2024"))
{
	break;
}
else
{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
}
}

List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/button/time"));
for(WebElement ele:li)
{
	
String date=ele.getText();
if(date.equals("20"))
{
ele.click();	
break;
}




	}
	
	
}
}


