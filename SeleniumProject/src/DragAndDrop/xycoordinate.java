package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class xycoordinate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dragabble");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.id("dragBox"));
		action.moveToElement(source);
		int x=source.getLocation().getX()+100;
		int y=source.getLocation().getY();
		action.dragAndDropBy(source, 500, 50).perform();
	//	action.moveToElement(source).dragAndDropBy(source, 500, 55).perform();
		
	}

}
