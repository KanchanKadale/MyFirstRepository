package Practice;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class DropDown {

	public static void main(String[] args) {
		// https://demoqa.com/select-menu
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		WebElement selectelement=driver.findElement(By.id("oldSelectMenu"));
		Select obj=new Select(selectelement);
		obj.selectByIndex(1);
		obj.selectByVisibleText("green");
		obj.selectByValue("7");
		
		List<WebElement> test=obj.getOptions();
		Iterator<WebElement> test=Options.iterator();
		while(test.hasNext())
		{
		    String str=test.next();
		    System.out.println(str);
		    
		}
		

	}

}
