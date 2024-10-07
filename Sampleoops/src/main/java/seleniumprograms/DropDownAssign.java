package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssign {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement multiSelectDropdown=driver.findElement(By.cssSelector("select#multi-select-field"));
		Select select=new Select(multiSelectDropdown);
		select.selectByIndex(1);
		select.selectByIndex(2);
		List<WebElement>selectedOptions= select.getAllSelectedOptions(); //to get all selected options
		System.out.println("The selected options are : ");
		for(WebElement options:selectedOptions)
		{	
			System.out.println(options.getText());
		}
		
		

	}

}
