package WebElementsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		//When you create object then automatically browser will lauch
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
 	    System.out.println(driver.getTitle());
	   driver.manage().window().maximize();
	
	  WebElement Fullname=driver.findElement(By.xpath("//input[@placeholder=\'Full Name\']"));
	  Fullname.sendKeys("Testing");
	  Fullname.clear();
	  Fullname.sendKeys("Mynewvalue");
	  
	  WebElement Email=driver.findElement(By.cssSelector("input [placeholder='name@example.com']"));
	  Email.sendKeys("test@test.com");
	
	  Fullname.clear();
	  Fullname.sendKeys("Mynewvalue");
	  
	  System.out.println(Fullname.getTagName());
	  WebElement Submit=driver.findElement(By.id("submit"));
	  System.out.println(Submit.getText());
	  System.out.println(Submit.getSize());
	  System.out.println(Fullname.getAttribute("id"));
	  //Submit.click();
	  
	
	
	  
	}

}
