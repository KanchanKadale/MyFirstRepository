package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/resizable");
			driver.manage().window().maximize();
			Actions action=new Actions(driver);
			WebElement element=driver.findElement(By.className("react-resizable-handle react-resizable-handle-se"));
			action.moveToElement(element);
			action.clickAndHold().moveByOffset(50, 50).release().build().perform();
			
		}
	}


