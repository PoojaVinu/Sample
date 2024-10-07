package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");   //switch to frame
		WebElement frameText=driver.findElement(By.id("sampleHeading"));
		String text=frameText.getText();
		System.out.println("The frame text is: " + text);
		
		driver.switchTo().parentFrame();   //back to parent defaultContent() can also be used instead
	}

}
