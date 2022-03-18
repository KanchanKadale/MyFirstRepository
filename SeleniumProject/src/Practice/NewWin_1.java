package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWin_1 {

	public static void main(String[] args) {
		// click on the "New Window " button and will try to read the text from the new Window.
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		// Open new window by clicking the button
		driver.findElement(By.id("windowButton")).click();
		
		// Click on the new window element and read the text displayed on the window
		WebElement text=driver.findElement(By.id("sampleHeading"));
		
		// Fetching the text using method and printing it  
		System.out.println("text printing" + text.getText());
		
		

	}

}
