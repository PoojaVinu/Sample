package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement selectColor=driver.findElement(By.id("single-input-field"));
		Select select=new Select(selectColor);   //object created for Select class
		//select.selectByIndex(1);               //3 ways we can select
		//select.selectByVisibleText("Red");
		select.selectByValue("Red");
		WebElement selectedColor=select.getFirstSelectedOption();  //to select
		String text=selectedColor.getText();
		System.out.println("The text is : " + text);
		
		

	}

}
