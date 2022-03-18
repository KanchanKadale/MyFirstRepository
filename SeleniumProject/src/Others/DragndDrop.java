package Others;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		String text=target.getText();
		if(text.equals("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

	
}
