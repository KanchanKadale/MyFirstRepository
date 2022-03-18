package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement SelectElement=driver.findElement(By.id("oldSelectMenu"));
		SelectElement.click();
		Select obj=new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
		//obj.selectByIndex(1);
		//obj.selectByValue("4");
		obj.selectByVisibleText("White");
		List<WebElement> options = obj.getOptions();
		Iterator<WebElement> allop=options.iterator();
		
		for(WebElement allOptions : options)
		{
			System.out.println(allOptions.getText());
		}
		//System.out.println(options);
		// Get the first selected option of the dropdown
		WebElement firstSelectedOption = obj.getFirstSelectedOption();
		// Get all the selected option of the dropdown
		List<WebElement> selectedOptions = obj.getAllSelectedOptions();
		
		
		
	}

}

