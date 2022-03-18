package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewWin_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		// Open new window by clicking the button
		driver.findElement(By.id("windowButton")).click();

		//Get handles of the windows
		String mainWindowHandle=driver.getWindowHandle();
		Set<String> allWindowHandles=driver.getWindowHandles();
		Iterator<String> iterator=allWindowHandles.iterator();
		
		// Here we will check if child window has other child windows and will fetch the heading of the child window
		while(iterator.hasNext())
		{
			String childwindow=iterator.next();
			if(!mainWindowHandle.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement text=driver.findElement(By.id("sampleHeading"));
				System.out.println("sample heading ="+ text.getText());
			}
			
		}
	}

}
