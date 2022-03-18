package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class SwitchToMainWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("msgWindowButtonWrapper")).click();
		
		String mainwindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String childWindow =i1.next();
			if(!mainwindow.equalsIgnoreCase(childWindow)) 
			{
			driver.switchTo().window(childWindow);
			WebElement text=driver.findElement(By.id("sampleHeading"));
			System.out.println(text.getText());
			System.out.println("on main window");
			driver.close();
			}
		}
		
		driver.switchTo().window(mainwindow);
		System.out.println("return to main window");
	}

}
