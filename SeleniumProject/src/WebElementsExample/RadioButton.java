package WebElementsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		
		//by using id 
		/*driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.className("custom-control custom-radio custom-control-inline")).click();
		driver.findElement(By.className("custom-control disabled custom-radio custom-control-inline")).click();*/
		
		WebElement YesradioButton =driver.findElement(By.xpath("//*[@id='yesRadio']"));
		
		boolean isSelected = YesradioButton.isSelected();
		
		if(isSelected == false) 
		{
			YesradioButton.click();
		}
		boolean isDisplayed = YesradioButton.isDisplayed();
		if (isDisplayed == true) {
			YesradioButton.click();
		}
		

	}

}
