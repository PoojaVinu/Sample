package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcepts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //implicit wait
		
		WebElement userName=driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord=driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));  //explicit wait
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Workers']")));  //condition specified
		wait.until(ExpectedConditions.alertIsPresent());   //alerts
		
		
		WebElement workers=driver.findElement(By.xpath("//a[text()='Workers']"));
		workers.click();

	}

}
