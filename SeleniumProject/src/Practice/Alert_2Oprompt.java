package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2Oprompt {

	public static void main(String[] args) {
		// On button click, prompt box will appear

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement element=driver.findElement(By.id("promtButton"));
		
		//element.click();
		System.out.println("click on promtButton");
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Alert PromptAlert=driver.switchTo().alert();
		String alertText =PromptAlert.getText();
		
		System.out.println("prompt text=" + alertText);
		
		//Send some text to the alert
		PromptAlert.sendKeys("test user");
		PromptAlert.accept();
		
		
	}

}
