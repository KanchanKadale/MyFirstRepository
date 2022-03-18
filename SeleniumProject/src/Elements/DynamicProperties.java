package Elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		 //WebElement enableafter=driver.findElement(By.id("enableAfter"));
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='enableAfter']")));
		 WebElement clickable=driver.findElement(By.xpath("//button[@id='enableAfter']"));
		clickable.click();
		/*if(clickable.isEnabled()) {
			System.out.println("btn is enable ");
		}else {System.out.println("btn is disable ");
		}*/
	}
}

