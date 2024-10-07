package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.id("loginform-username")); //declaring WebElement
		userName.sendKeys("pooja");
		userName.clear(); //to clear the text field
		String tagName=userName.getTagName();  //get the tagname in the html
		System.out.println("Tag Name : " + tagName);
		String attributeValue=userName.getAttribute("name"); //get attribute value from html
		System.out.println("Attribute Value : " + attributeValue);
		
		WebElement password=driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys("abc");
		
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();
		
		String text=login.getText(); //to get the text of that element
		System.out.println("Text on Login: " + text);
		
		String fontSize=login.getCssValue("font-size"); 
		System.out.println("Font Size: " + fontSize);
		
		
		
		
		
		

	}

}
