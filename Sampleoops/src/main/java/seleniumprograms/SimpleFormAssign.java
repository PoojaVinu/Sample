package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormAssign {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enterMessage=driver.findElement(By.id("single-input-field"));
		enterMessage.sendKeys("Addition of two numbers");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
		
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("2");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("4");
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		
		String messageButton=showMessage.getText();
		System.out.println("Show Message text : " + messageButton);
		String totalButton=getTotal.getText();
		System.out.println("Get Total text : " + totalButton);
		
		String messageColor=showMessage.getCssValue("background-color");
		System.out.println("Show Message background color : " + messageColor);
		String totalColor=getTotal.getCssValue("background-color");
		System.out.println("Get Total background color : " + totalColor);
		

	}

}
