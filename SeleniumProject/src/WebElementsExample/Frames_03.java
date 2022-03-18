package WebElementsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_03 {

	public void t1()
	{
		//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
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("content");
		WebElement header =driver.findElement(By.tagName("h1"));
		System.out.println(header.getText());
		driver.switchTo().defaultContent();
		WebElement noframe=driver.findElement(By.xpath("//a[text()='No frames']"));
		driver.switchTo().frame(noframe);
		WebElement  frame=driver.findElement(By.xpath("//Frame[@name='navbar']"));
		
	}

}
