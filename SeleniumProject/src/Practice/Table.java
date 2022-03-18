package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		WebDriver wd;
		  System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		  wd= new ChromeDriver();
	      wd.get("http://demo.guru99.com/test/web-table-element.php");        
	      List <WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	      System.out.println("No of cols are : " +col.size());
	      List <WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
	       System.out.println("No of rows are : " + rows.size());
	        //wd.close();
	       WebElement baseTable = wd.findElement(By.tagName("table"));
	       
	       WebElement TableRow= baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
	       String rowtext=TableRow.getText();
	       System.out.println("Third row of table : "+rowtext);
	         
	       WebElement cellIneed = TableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
	       String valueIneed =cellIneed.getText();
	       System.out.println("Cell value is : "+valueIneed );
	       
	       //Get Maximum of all the Values in a Column of Dynamic Table
	      
	}

}
