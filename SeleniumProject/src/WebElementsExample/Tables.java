package WebElementsExample;

import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		List<WebElement> coloumn=driver.findElements(By.xpath("//div[@role='column']"));
		 System.out.println("No of cols are : " +coloumn.size()); 
		 
		 List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]"));
		 System.out.println("No of cols are : " +row.size()); 
		 
		/*List<WebElement> columnname=driver.findElement(By.xpath("//div[@role='column']"));
		System.out.println(columnname.size());
		Iterator itr=columnname.iterator();
		List<WebElement> itr=columnname.iterator();
	
		for(int i=0;i<columnname.size();i++)
		{
			System.out.println(columnname.get(i).getText());
		}
		System.out.println(columnname.size());
		Iterator<WebElement> itr1= columnname.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
			
		}
		List<WebElement> row=driver.findElement(By.xpath("//div[@role='gridcell']"));*/
		
		
		
		
	}

}
