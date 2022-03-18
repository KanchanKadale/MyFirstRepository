package Alerts_window_Frame;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//1
		WebElement clickme1=driver.findElement(By.xpath("//div/span[text()='Click Button to see alert ']"));
		String str1=clickme1.getText();
		System.out.println(str1);
		WebElement alert=driver.findElement(By.id("alertButton"));
		alert.click();
		Alert obj=driver.switchTo().alert();
		Thread.sleep(1000);
		obj.accept();
		
		/*//2  
		WebElement clickme2=driver.findElement(By.xpath("//div/span[text()='On button click, alert will appear after 5 seconds ']"));
		String str2=clickme2.getText();
		System.out.println(str2);
		WebElement alert2=driver.findElement(By.id("timerAlertButton"));
		alert2.click();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parent=driver.getWindowHandle();
		Set<String> str=driver.getWindowHandles();
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			String childwindow1=itr.next();
			if(!parent.equals(childwindow1))
			{
				driver.switchTo().window(childwindow1).getTitle();
				
			}
		}
		Alert obj1 =driver.switchTo().alert();
		obj1.accept();
		//obj1.dismiss();
		*/
		//3
		WebElement clickme3=driver.findElement(By.xpath("//div/span[text()='On button click, confirm box will appear']"));
		String str3=clickme3.getText();
		System.out.println(str3);  
		WebElement alert3=driver.findElement(By.id("confirmButton"));
		alert3.click();
		Alert obj2=driver.switchTo().alert();
		Thread.sleep(1000);
		obj2.accept();
		//obj2.dismiss();
		
		//4
		WebElement clickme4=driver.findElement(By.xpath("//div/span[text()='On button click, prompt box will appear']"));
		String str4=clickme4.getText();
		System.out.println(str4);
		WebElement obj3=driver.findElement(By.id("promtButton"));
		obj3.click();
		Alert newalert=driver.switchTo().alert();
		Thread.sleep(1000);
		newalert.sendKeys("kk");
		newalert.accept();
		
		
	}

}
