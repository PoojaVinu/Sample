package seleniumprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		WebElement newTab=driver.findElement(By.id("tabButton"));
		newTab.click();
		
		String parentWindow=driver.getWindowHandle(); //parent window id returned to a string
		System.out.println("ParentWindow id: " + parentWindow);
		
		Set<String>allWindows=driver.getWindowHandles();  //all windows id
		System.out.println("All windows id: " + allWindows);
		for(String childWindow:allWindows)
		{
			if(!parentWindow.equals(childWindow))
			{
		      driver.switchTo().window(childWindow);  // to go to child window
		      WebElement textFromChild=driver.findElement(By.id("sampleHeading"));
		      String text=textFromChild.getText();
		      System.out.println("Text from child : " + text);
			}
		}
		
		driver.switchTo().window(parentWindow);   //to get back to parent window
		

	}

}
