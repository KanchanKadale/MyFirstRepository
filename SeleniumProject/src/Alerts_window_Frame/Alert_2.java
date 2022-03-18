package Alerts_window_Frame;

import java.awt.Window;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_2 {

	private static final Duration timeout = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement maintext=driver.findElement(By.xpath("//div/span[text()='On button click, alert will appear after 5 seconds ']"));
		String str=maintext.getText();
		System.out.println(str);
		
		WebElement clickme=driver.findElement(By.id("timerAlertButton"));
		clickme.click();
		
		Alert  simpleAlert =driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	    simpleAlert.accept();
		
		
	}

}
