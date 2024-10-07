package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='gridCheck']")); //xpath
		//checkBox1.click();
		Boolean check=checkBox1.isSelected();  //to check if the checkbox is selected or not
		System.out.println(check);
		

	}

}
