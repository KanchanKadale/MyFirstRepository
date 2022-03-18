package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RevertDragable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		WebElement RevertDraggable=driver.findElement(By.id("droppableExample-tab-revertable"));
		RevertDraggable.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		Actions action=new Actions(driver);
		WebElement Revert=driver.findElement(By.id("revertable"));
		WebElement notRevert=driver.findElement(By.id("notRevertable"));
		WebElement DropBox=driver.findElement(By.id("droppable"));
		action.dragAndDrop(notRevert, DropBox).perform();
		
		
	}

}
