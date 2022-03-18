package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//for double click me button
		Actions action=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleclick).perform();
		//for right click me button
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightclick).perform();
		//for  click me button
		/*WebElement dynamicclick=driver.findElement(By.tagName("button"));
		dynamicclick.click();*/
	}
	

}
