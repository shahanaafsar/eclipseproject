package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Aerofil {

	public static void main(String[] args) {
		String base="https://shop.aerofil.in/";
		ChromeDriver driver=new ChromeDriver();
		driver.get(base);
String store=driver.getPageSource();
if(store.contains("Store Location"))
{
	System.out.println("store present");
}
else
{
System.out.println("store absent");	
}
driver.quit();
	}

}
