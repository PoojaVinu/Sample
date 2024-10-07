package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();  //to launch Chrome browser
		
		//WebDriver driver=new EdgeDriver();   //to launch Edge browser
		
		//WebDriver driver=new FirefoxDriver();  //to launch FireFox browser
		
		driver.get("https://www.google.com"); //navigate to a url
		
		String currenturl=driver.getCurrentUrl();//get the url 
		System.out.println("Current Url : " + currenturl); 
		
		driver.navigate().to("https://www.amazon.com"); //will not check if the page is loaded 
		
		String title=driver.getTitle();
		System.out.println(title); //to get tab heading
		
		String pagehtml=driver.getPageSource(); //html code of that page
		System.out.println(pagehtml);
		
		driver.manage().window().fullscreen();  //execute the page to fullscreen
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh(); //refresh the page
		
		driver.manage().deleteAllCookies();
		
		//driver.close(); //current window will be closed
		
		driver.quit();    //close all the pages kill the driver existence

	}

}
