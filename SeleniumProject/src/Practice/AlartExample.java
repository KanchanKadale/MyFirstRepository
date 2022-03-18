package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alert");
		//"//div[@role='column']
		WebElement clickbutton=driver.findElement(By.xpath("//button[@id='alartbutton']"));
		clickbutton.click();
		
		//click on ok (accept())
		Alert obj=driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(obj.getText());
		obj.dismiss();
		
		
	
	
	
	}

}
