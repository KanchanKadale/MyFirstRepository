package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("userName"));
		username.sendKeys("abcd");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("abcd@gmail.com");
		WebElement currenetadd=driver.findElement(By.id("currentAddress"));
		currenetadd.sendKeys("khamgaon");
		WebElement parmanantadd=driver.findElement(By.id("permanentAddress"));
		parmanantadd.sendKeys("kamgaon shegaon");
		//for scroldown page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		WebElement submitbutton=driver.findElement(By.id("submit"));
		submitbutton.click();
		
		//checkbox
		WebElement checkbox=driver.findElement(By.id("item-1"));
		checkbox.click();
		
	
		WebElement MainArrow=driver.findElement(By.xpath("//div[@id='tree-node']//ol/li//button"));
		//Check the Home checkbox only if it is not already selected
			MainArrow.click();
		WebElement HomeCheckbox=driver.findElement(By.xpath("//label[@for='tree-node-home']/span"));
		HomeCheckbox.click();
		WebElement arrowbutton=driver.findElement(By.className("a:contains(rct-node rct-node-parent rct-node-expanded)"));
		arrowbutton.click();
		
		//Print the result which display after selecting the checkbox home 
		WebElement Result=driver.findElement(By.xpath("//div[@id='result']"));
		System.out.println(Result.getText());
	}

}
