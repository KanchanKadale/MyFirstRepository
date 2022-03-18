package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement slider=driver.findElement(By.className("range-slider range-slider--primary"));
		action.moveToElement(slider);
		action.clickAndHold().moveByOffset(10, 10).perform();
		
		
	}

}
