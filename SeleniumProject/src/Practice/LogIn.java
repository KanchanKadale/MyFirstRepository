package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//for username field
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.click();
		username.sendKeys("Admin");
		//for password field
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.click();
		password.sendKeys("admin123");
		//for submit button
		WebElement submitbutton=driver.findElement(By.id("btnLogin"));
		submitbutton.click();
		//is dashboard is selected or not
		WebElement dashboard=driver.findElement(By.id("menu_dashboard_index"));
		//boolean dash=dashboard.isDisplayed();
		//System.out.println(dash);
		boolean str=dashboard.isSelected();
		System.out.println(str);
		if(dashboard.isDisplayed())
		{
			
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		
		
		
		
		
	}

}
