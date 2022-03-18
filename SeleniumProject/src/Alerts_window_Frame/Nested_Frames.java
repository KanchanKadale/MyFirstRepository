package Alerts_window_Frame;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		// /html/body/text()
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		int a=frames.size();
		System.out.println("no of frames present" +a);
		
		driver.switchTo().parentFrame().getTitle();
		WebElement iframe=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		String str=iframe.getText();
		System.out.println(str);
		

	}

}
