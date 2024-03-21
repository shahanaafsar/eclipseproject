package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationsignupexercise {
ChromeDriver driver;
String baseurl="https://automationexercise.com/login";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
@Test
public void signup()
{
	WebElement name=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]"));
	name.sendKeys("sha");
	WebElement email=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]"));
	email.sendKeys("shahana2@gmail.com");
	WebElement signup=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button"));
	signup.click();
	
	
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[1]/div[2]/label/div/span/input")).click();
//WebElement username=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[2]/input"));
//username.sendKeys("shahana");
driver.manage().window().maximize();
//WebElement emailid=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[3]/input[1]"));
//emailid.sendKeys("shahana@gmail.com");

WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
password.sendKeys("shahana123");

WebElement day=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select"));
WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
WebElement year=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select"));
Select daydetails =new Select(day);
daydetails.selectByValue("10");
Select monthdetails =new Select(month);
monthdetails.selectByVisibleText("February");
Select yeardetails =new Select(year);
yeardetails.selectByValue("1993");


driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[6]/div/span/input")).click();


WebElement firstname=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[1]/input"));
firstname.sendKeys("shahana");
WebElement lastname=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[2]/input"));
lastname.sendKeys("ssss");
WebElement companyname=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[3]/input"));
companyname.sendKeys("company");

WebElement address1=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[4]/input"));
address1.sendKeys("qwerty,bhy,");
WebElement address2=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[5]/input"));
address2.sendKeys("zxcvbnm,sdfgh");
WebElement country=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select"));
Select countrydetails=new Select(country);
countrydetails.selectByIndex(1);


WebElement state=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[7]/input"));
state.sendKeys("kerala");
WebElement city=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[8]/input"));
city.sendKeys("thiruvanathapuram");
WebElement zipcode=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[9]/input"));
zipcode.sendKeys("123456");
WebElement mobile=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input"));
mobile.sendKeys("898978675");
driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
}
}
