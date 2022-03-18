package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		//switch to an iframe By Index
		driver.switchTo().frame("frame1");
		WebElement frame1=driver.findElement(By.id("sampleHeading"));
		String frametext=frame1.getText();
		System.out.println(frametext);
		driver.close();
		
		
	}

}
