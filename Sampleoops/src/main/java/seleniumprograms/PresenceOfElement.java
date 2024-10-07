package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PresenceOfElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement showMessage=driver.findElement(By.id("button-one"));
		Boolean presenceOfElement=showMessage.isDisplayed();  //to check the presence of an element
		System.out.println("Presence of element : " + presenceOfElement);
		
		Boolean enable=showMessage.isEnabled();            //enable or not
		System.out.println("Enable or not :" + enable);

	}

}
