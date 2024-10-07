package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		WebElement radioButton=driver.findElement(By.cssSelector("input#inlineRadio2"));  //cssSelector
		radioButton.click();
		Boolean buttonSelect=radioButton.isSelected();
		System.out.println("Radio Button Select : " + buttonSelect);
		
		WebElement selectedValue=driver.findElement(By.cssSelector("button#button-one"));
		selectedValue.click();
		WebElement valueResult=driver.findElement(By.cssSelector("div#message-one"));
		String textResult=valueResult.getText();
		System.out.println("Text result of selected button : " + textResult);
		
		WebElement patientsGender=driver.findElement(By.cssSelector("input#inlineRadio11"));
		patientsGender.click();
		Boolean genderSelect=patientsGender.isSelected();
		System.out.println("Patients gender selection : " + genderSelect);
		
		WebElement patientsAgeGroup=driver.findElement(By.cssSelector("input#inlineRadio23"));
		patientsAgeGroup.click();
		Boolean ageSelection=patientsAgeGroup.isSelected();
		System.out.println("Age selection : " + ageSelection);
		
		WebElement getResults=driver.findElement(By.xpath("//button[@id='button-two']"));
		getResults.click();
		WebElement resultText=driver.findElement(By.cssSelector("div#message-two"));
		String result=resultText.getText();
		System.out.println("The result is : " + result);
		

	}

}
