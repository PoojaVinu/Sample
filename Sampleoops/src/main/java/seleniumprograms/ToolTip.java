package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement allDropdown=driver.findElement(By.id("searchDropdownBox"));
		String toolTipValue=allDropdown.getAttribute("title");
		System.out.println("Attribute value :" + toolTipValue);
		
		
	}

}
