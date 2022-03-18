package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement yesbutton=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		yesbutton.click();
		
		WebElement textmsg=driver.findElement(By.xpath("//span[@class='text-success']"));
		String str=textmsg.getText();
		System.out.println(str);
		if(textmsg.isDisplayed())
		{
			System.out.println("yes butto is selected");
		}else
		{
			System.out.println("yes button is disable");
		}
		 WebElement impressivebutton=driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		 impressivebutton.click();
		
		 WebElement nobutton=driver.findElement(By.xpath("//input[@id='noRadio']"));
		 System.out.println("button is enable= " +nobutton.isEnabled());
		 
		
	}

}
