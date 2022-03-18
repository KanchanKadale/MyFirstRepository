package WebElementsExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys_Stroke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//username
		WebElement username=driver.findElement(By.id("txtUsername"));
	
		username.click();
		username.sendKeys("Admin");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		
		//password
		WebElement password=driver.findElement(By.id("txtPassword"));
		//password.click();
		
		WebElement submitbutton=driver.findElement(By.id("btnLogin"));
		//submitbutton.click();
		//1
		//submitbutton.sendKeys(Keys.ENTER);
		//2
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		password.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		//3
		String select=Keys.chord(Keys.CONTROL,"a");
		String copy=Keys.chord(Keys.CONTROL,"c");
		String paste=Keys.chord(Keys.CONTROL,"v");
		username.sendKeys(select);
		username.sendKeys(copy);
		password.click();
		password.sendKeys(paste);
		
	
	}

}
