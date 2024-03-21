package Junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void body()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void screensht() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\s\\Desktop\\New folder//fbscreenshot.png"));
		WebElement loginbutton=driver.findElement(By.name("login"));
		File src1=loginbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot/loginbutton.png"));
		
		
		File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src3,new File("C:\\Users\\s\\Desktop\\New folder//fb1screenshot.png"));
		WebElement createbutton=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]"));
		File src2=createbutton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshot/createbutton.png"));
	}
}
