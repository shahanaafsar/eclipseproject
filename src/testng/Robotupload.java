package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Robotupload {
ChromeDriver driver;
String baseurl="https://www.ilovepdf.com/pdf_to_word";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void fileuploadpgm()throws Exception
{
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div[3]/a")).click();
	fileUpload("C:\\Users\\s\\Desktop\\test excel\\note\\Hackr.io SQL Commands List PDF.pdf");
	
	
}
public void fileUpload (String p)throws AWTException{
StringSelection strSelection=new StringSelection(p);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);

Robot robot=new Robot();
robot.delay(1000);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.delay(2000);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
}}
