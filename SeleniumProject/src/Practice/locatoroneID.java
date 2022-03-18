package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatoroneID {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
 	    //System.out.println(driver.getTitle());
	   //driver.manage().window().maximize();
		
		//The Java Syntax for locating a web element using its id attribute is written as:
		driver.findElement(By.id("userName"));
		driver.findElement(By.id("userName")).sendKeys("javapoint");//print username
		driver.findElement(By.id("userEmail")).sendKeys("anc@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("khamgaon");
		driver.findElement(By.id("permanentAddress")).sendKeys("civil line");
		driver.executeScript("window.scrollBy(0,250)"); //for page scrolling 
		
		WebElement submit= driver.findElement(By.id("submit"));//for click on button
		submit.click();
		System.out.println(submit.getText());
		System.out.println("hight= " + submit.getSize().getHeight());
		System.out.println("weidth= " + submit.getSize().getWidth());
		
		
	
	}

}
