package WebElementsExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		/*Select obj=new Select(driver.findElement(By.xpath("//*[@id='cars']")));
		obj.selectByIndex(0);
		obj.selectByIndex(1);
		System.out.println(obj.isMultiple());*/
		
		driver.findElement(By.xpath("*//div[@class='  css-1okebmr-indicatorSeparator']"));
		//Thread.sleep(1000);
		//driver.findElement(By.className(" css-1gtu0rj-indicatorContainer"));
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'-indicatorContainer')]"));
		driver.findElement(By.id("react-select-2-option-0-0"));
		
	}

}
