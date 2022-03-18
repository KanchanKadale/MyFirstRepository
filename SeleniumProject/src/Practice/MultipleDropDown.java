package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select obj=new Select(driver.findElement(By.xpath("//*[@id='cars']")));
		System.out.println("print all option in dropdown=");
		
		List<WebElement> options=obj.getOptions();
		for(WebElement allopt:options)
		{
			System.out.println(allopt.getText());
		}
		obj.selectByIndex(1);
		obj.selectByIndex(2);
		WebElement firstSelectedOption=obj.getFirstSelectedOption();
		String s=firstSelectedOption.getText();
		System.out.println("first selected" + s);
		List<WebElement> allselected=obj.getAllSelectedOptions();
		for(WebElement allsel:allselected)
		{
		System.out.println("all selected options " +allsel.getText());	
		}
		//obj.selectByValue("saab");
		//obj.selectByVisibleText("Opel");
		obj.deselectByIndex(1);
		obj.deselectAll();
		

	}

}
