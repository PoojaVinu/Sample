package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickMe=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe.click();
		String text=driver.switchTo().alert().getText();  //to get text
		System.out.println("Text : " + text);
		driver.switchTo().alert().accept();       //to press ok button
		//driver.switchTo().alert().dismiss();   //to press cancel button
		
		
	}

}
