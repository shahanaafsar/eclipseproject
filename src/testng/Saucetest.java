package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Saucetest {
	WebDriver driver;
	String baseurl="https://www.saucedemo.com";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		}
	@Test
	public void datadriven() throws IOException
	{
	driver.get(baseurl);	
	FileInputStream fi=new FileInputStream("C:\\Users\\s\\Desktop\\test excel\\sauce.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);//return workbook details
	XSSFSheet sh=wb.getSheet("sheet1");//return sheet details
	int rowcount=sh.getLastRowNum();//return rowcount
	System.out.println(rowcount);
	for(int i=1;i<=rowcount;i++)
	{
		String username = sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println("username="+username);
		String pswd = sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("password="+pswd);
		driver.findElement(By.name("user-name")).clear();
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pswd);
		driver.findElement(By.name("login-button")).click();
		driver.navigate().refresh();
	}
	}
}
