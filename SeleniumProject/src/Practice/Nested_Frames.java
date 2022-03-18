package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		 //Number of Frames on a Page
        int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of Frames on a Page:" + countIframesInPage);
        
        //Locate the frame1 on the webPage
        WebElement frame1=driver.findElement(By.id("frame1"));
        
        //Switch to Frame1
        driver.switchTo().frame(frame1);
        
        //Locate the Element inside the Frame1
        WebElement frame2=driver.findElement(By.tagName("body"));
        String frame2text=frame2.getText();
        System.out.println(frame2text);
      //Number of Frames on a parentwindow
        int fraame2number=driver.findElements(By.tagName("body")).size();
        System.out.println(fraame2number);
        //switch to childwindow
        driver.switchTo().frame(0);
        //WebElement childframe=driver.findElement(By.tagName("iframe"));
        WebElement childframe=driver.findElement(By.xpath(" //iframe[contains(@name,'frame')]"));
        String childText=childframe.getText();
        System.out.println(childText);
        driver.switchTo().parentFrame();
       
         
		 
	}

}

