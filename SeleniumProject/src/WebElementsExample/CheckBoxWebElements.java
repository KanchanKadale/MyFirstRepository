package WebElementsExample;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class CheckBoxWebElements {

	public static void main(String[] args) {
//APPROACH 1- SELECTING HOME PAGE CHECKBOX AND JUST READ THE RESULT
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/checkbox");
		//Find the address of home checkbox
		WebElement HomeCheckbox=driver.findElement(By.xpath("//div[@id='result']"));
	  // System.out.println(Result.getText());
		
		
		//APPROACH 2- SELECTING HOME PAGE CHECKBOX AND JUST READ THE RESULT
		
				
				
		
		
		
	}

}
