package Widget;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		action.moveToElement(slider);
		action.clickAndHold().moveByOffset(100, 0).release().perform();
		
		
	}

}
