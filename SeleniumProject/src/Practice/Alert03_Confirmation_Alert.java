package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Alert03_Confirmation_Alert {

	public static void main(String[] args) {
		// Confirmation Alert"

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

		WebElement element= driver.findElement(By.id("confirmButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		Alert Alertconfirmation=driver.switchTo().alert();
		String alerttext=Alertconfirmation.getText();
		System.out.println(alerttext);
		//Alertconfirmation.accept();
		Alertconfirmation.dismiss();
				
		
		
	
	
	}

}
