package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//launch browser
		driver.get("https://www.google.com");//load url.
		 String title= driver.getTitle();
        String exp="Google";
        
      //  System.out.println(exp.equalsIgnoreCase(title));
if(exp.equals(title))
{
System.out.println("pass");	
}
else
{
System.out.println("fail");	
}
driver.quit();
	}

}
