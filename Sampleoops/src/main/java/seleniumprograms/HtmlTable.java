package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		List<WebElement> firstRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		System.out.println("First row values : " );
		for(int i=0;i<firstRow.size();i++)
		{
			String text=firstRow.get(i).getText();
			System.out.println(text);
		}

		List<WebElement> firstColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		System.out.println("Column Values :");
		for(int i=0;i<firstColumn.size();i++)
		{
			String textOfColumn=firstColumn.get(i).getText();
			System.out.println(textOfColumn);
		}
		
		WebElement randomRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td[3]" )); //static table we can do like this
		System.out.println("5th row and 3rd column : " + randomRow.getText());
		
		List<WebElement> header=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr"));
		System.out.println("The Header of the table is : " );
		for(int i=0;i<header.size();i++)
		{
			String headerText=header.get(i).getText();
			System.out.println(headerText);
		}
		
  }
}
