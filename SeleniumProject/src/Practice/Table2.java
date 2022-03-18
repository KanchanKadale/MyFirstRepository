package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		
		//Finding number of Rows
		List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@role='row']"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + rowCount);
		
		List<WebElement> colname = driver.findElements(By.xpath("//*[@role='row']"));
		
		Iterator itr=  colname.iterator();
		int coldata=colname.size();
		for(int i=0;i<coldata;i++)
		{
			System.out.print(colname.get(i).getText());
		}
		/*while (itr.hasNext())
		{
            System.out.print(itr.next() + " ");
		}*/
       // System.out.println();
		
		
		//Finding number of Columns
		List<WebElement> colNumber = driver.findElements(By.xpath("//*[@role='gridcell']"));
		int colCount = colNumber.size();
		System.out.println("No of columns in this table : " + colCount);
		
		List<WebElement> gentry=driver.findElements(By.xpath("//*[@role='rt-td'/text()='gentry']")) ;
		for(int j=0;j<=gentry.size();j++)
		{
			System.out.println(gentry.toString());
		}
		
		//*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div/div[2]
		
		
		
	}

}
