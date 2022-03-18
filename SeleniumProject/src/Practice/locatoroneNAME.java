package Practice;

import java.awt.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Collection;
public class locatoroneNAME {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		
		WebElement HomeCheckbox =driver.findElement(By.xpath("//label[@for='tree-node-home']/span"));
		//HomeCheckbox.click();
		if(!HomeCheckbox.isSelected())
		{
			HomeCheckbox.click();
		}
		WebElement Result=driver.findElement(By.xpath("//div[[@id='result']"));
		System.out.println(Result.getText());		
		
		//if checkbox not selected
	
		if(Result.isDisplayed())
		{
			System.out.println(Result.getText());
			
		}
		/*if(Result.size())
		{
			System.out.println(Result.get(0).getText());
		}*/
		
		
		
				
		
		

	}

}
