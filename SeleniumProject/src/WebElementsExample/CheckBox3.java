package WebElementsExample;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class CheckBox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver(); //driver is a reference of chromedriver class
		//Enter the URL which you want to enter in the browser
		driver.get("https://demoqa.com/checkbox");
		//Find the address of home checkbox
		WebElement HomeCheckbox=driver.findElement(By.xpath("//div[@id='result']"));
	  
		if(!HomeCheckbox.isSelected())
		{
			HomeCheckbox.click();
		}
		WebElement Result=driver.findElement(By.xpath("//div[[@id='result']"));
		System.out.println(Result.getText());		
		if(Result.isDisplayed())
		{
			System.out.println(Result.getText());
		}

		//approch 3
		List<WebElement> Result=driver.findElements(By.xpath("//div[[@id='result']"));
		if(Result.Size()>0)
		{
			System.out.println(Result.get(0).getText());
		}	
		
		else
		{
			System.out.println("test case is failed system is not showing result");
		}
		//label[@for='tree-node-desktop']//preceding-sibling::button
	}

}
