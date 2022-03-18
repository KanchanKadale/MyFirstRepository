package Alerts_window_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.id("frame1"));
		//driver.switchTo().frame("frame1");
		//driver.switchTo().frame(1);
		//driver.switchTo().frame(frame1);
		
		//WebElement frameText=driver.findElement(By.id("sampleHeading"));
		String text=frame1.getText();
		System.out.println(text);
		driver.switchTo().frame(0);
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		int a=frames.size();
		System.out.println("total number of frames present" +a);
	}

}
