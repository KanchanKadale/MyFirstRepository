package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_Accept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		Actions action=new Actions(driver);
		driver.findElement(By.id("droppableExample-tab-accept")).click();
		WebElement source1=driver.findElement(By.id("acceptable"));
		WebElement source2=driver.findElement(By.id("notAcceptable"));
		WebElement target=driver.findElement(By.className("drop-box ui-droppable"));
		
		//WebElement target=driver.findElement(By.xpath("//div[@id=\\\"acceptDropContainer\\\"]//div[@id=\\\"droppable\\\"]"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		action.dragAndDrop(source1,target).perform();
		action.dragAndDrop(source2,target).perform();
		String text=target.getText();
		String text2=target.getText();
		
		if(text.equals("Dropped!"))
		{
			System.out.println("acceptable objet is placed here");
		}else if(text.equals("Drop here"))
				{
			System.out.println("notAcceptable obj is dropped");
		}
		else
		{
			System.out.println("object not droppet yet");
		}
	}

}
