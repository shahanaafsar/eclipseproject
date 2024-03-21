package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourceprm {

	public static void main(String[] args) {
		
		String base="https://www.google.com";
	ChromeDriver driver=new ChromeDriver();
	driver.get(base);
	String src=driver.getPageSource();

	if(src.contains("Gmail"))
	{
		System.out.println("Gmail is present");
	}
	else
	{
		System.out.println("Gmail is absent");
	}
	driver.quit();
	}

}
