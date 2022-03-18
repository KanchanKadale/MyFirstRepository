package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {

	public static void main(String[] args) {
		// The alert box displayed below requires an action 
		//from the user to press OK and accept or press Cancel and dismiss the message box.
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		System.out.println("main window is opened");
		driver.findElement(By.id("alertButton")).click();
		System.out.println("click on alart button");
		Alert simplealart=driver.switchTo().alert();
		/*System.out.println("click on ok ");
		simplealart.accept();*/
		System.out.println("click on cancle");
		simplealart.dismiss();
		

	}

}
