package Alerts_window_Frame;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windos {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement newwin=driver.findElement(By.id("tabButton"));
		newwin.click();
		
		String parent=driver.getWindowHandle();
		Set<String> str=driver.getWindowHandles();
		Iterator<String> itr=str.iterator();
		while(itr.hasNext())
		{
			String childwin=itr.next();
			if(!parent.equals(childwin))
			{
				
				driver.switchTo().window(childwin).getTitle();
			}
			
		}
	
		Thread.sleep(1000);
		WebElement title=driver.findElement(By.id("sampleHeading"));
		String text=title.getText();
		System.out.println(text);
		
		driver.switchTo().window(parent);
		
		//2
		WebElement newwinbutton=driver.findElement(By.id("windowButton"));
		newwinbutton.click();
		while(itr.hasNext())
		{
			String childwin=itr.next();
			if(!parent.equals(childwin))
			{
				
				driver.switchTo().window(childwin).getTitle();
			}
			
		}
		driver.switchTo().window(parent);
		//3
		WebElement winmsg=driver.findElement(By.id("messageWindowButton"));
		winmsg.click();
		while(itr.hasNext())
		{
			String childwin=itr.next();
			if(!parent.equals(childwin))
			{
				driver.switchTo().window(childwin);
				driver.manage().window().maximize();
			}
		}
		WebElement content=driver.findElement(By.tagName("body"));
		String str1=content.getText();
		
	}

}
