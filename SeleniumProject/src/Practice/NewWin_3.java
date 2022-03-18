package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class NewWin_3 {

	public static void main(String[] args) {
		// handle multiple windows in Selenium
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		// Opening all the child window
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("msgWindowButtonWrapper")).click();
		
		String mainwindow= driver.getWindowHandle();
		System.out.println("main window handle is =" + mainwindow);
		
		// To handle all new opened window
		Set<String> s=driver.getWindowHandles();
		System.out.println("child window handles "+s);
		Iterator<String> i1=s.iterator();
		
		 // Here we will check if child window has other child windows and when child window
	    //is the main window it will come out of loop.
		while(i1.hasNext())
		{
			String childwindow=i1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				System.out.println("Child window closed");
			}
		}
	//  Switch back to the main window which is the parent window.
		driver.switchTo().window(mainwindow);
		System.out.println("switch to main window");
		

	}

}
