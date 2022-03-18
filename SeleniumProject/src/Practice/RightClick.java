package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// Find below the code for performing right click on the web element
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		System.out.println("page is displayed");
	
		driver.manage().window().maximize();
		//Instantiate Action Class
		Actions action=new Actions(driver);
		
		 //Retrieve WebElement to perform right click
		WebElement button2=driver.findElement(By.id("rightClickBtn"));
		action.contextClick(button2).perform();
		System.out.println("right click context menu is displayed");
		
		WebElement button1=driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(button1).perform();
		System.out.println("double click button is displayed");
		
		WebElement button3=driver.findElement(By.xpath("//*[@id='nZj20']"));
		action.click(button3).perform();
		System.out.println("click me button is displayed");
		
		
		
		
	}

}
