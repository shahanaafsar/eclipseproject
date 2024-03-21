package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
WebDriver driver;
By createpage=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/a");

By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");


public Fbcreatepage(WebDriver driver) {
	
	this.driver=driver;
}

public String titleverification()
{
	String title=driver.getTitle();
	return title;
}
public void createclick()
{
driver.findElement(createpage).click();
}
public void signupclick()
{
driver.findElement(signup).click();
}
}

