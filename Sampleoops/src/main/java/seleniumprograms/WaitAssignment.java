package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName=driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord=driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		
		WebDriverWait workerWait=new WebDriverWait(driver, Duration.ofSeconds(10));
		workerWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Workers']")));
		WebElement worker=driver.findElement(By.xpath("//a[text()='Workers']"));
		worker.click();
		
		WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBe(By.xpath("//button[@type='submit']"), "Search"));
	
		
		String locator=null;
		List<WebElement> serialNum=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tbody//td[1]"));
		for(int i=0;i<serialNum.size();i++)
		{
			if(serialNum.get(i).getText().equals("2"))
			{
				locator="//table[@class='table table-striped table-bordered']//tbody// tr[" + (i+1) + "]//td[8]//a[3]";
				break;
			}
		}
		
		WebElement deleteButton=driver.findElement(By.xpath(locator));
		deleteButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
}
