package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		//"//div[@role='column']
		System.out.println(driver.getWindowHandle());
		String parentwindow=driver.getWindowHandle();
		WebElement tabutton=driver.findElement(By.id("tabButton"));
		tabutton.click();
		Set<String> handles=driver.getWindowHandles(); 
		Iterator<String> itr=handles.iterator();
		while(itr.hasNext())
		{
			String child=itr.next().toString();
					//System.out.println(itr.next().toString());
			if(!parentwindow.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
			}
		}
		
		//System.out.println(driver.getWindowHandles());
		//WebElement clickbutton=driver.findElement(By.xpath("//button[@id='alartbutton']"));
		//String web1="CDwindow-935B0642F0EB83EDB1F923BE29724AB8";
		
		driver.switchTo().window(web1);
	
	
	}

}
