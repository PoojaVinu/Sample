package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", ""); //top-bottom of the page
		js.executeScript("window.scrollBy(0,-1000)", ""); //bottom-top of the page
		
		//js.executeScript("arguments[0].click();", element); //clicking an element
		
		//WebElement hyperLink=driver.findElement(By.linkText("Bootstrap Alert"));  //using linkText
		//hyperLink.click();
		
		WebElement hyperLink=driver.findElement(By.partialLinkText("Alert"));  //using partial link text
		hyperLink.click();
		

	}

}
