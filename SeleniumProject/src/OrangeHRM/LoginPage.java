package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\kanchan\\workspace\\classpractice\\src\\StringPackage\\SeleniumProject\\Resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*//username
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		username.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		//password
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		password.click();
		//submit button
		WebElement submitbutton=driver.findElement(By.id("btnLogin"));
		submitbutton.click();
		//my info
		WebElement myinfo=driver.findElement(By.id("menu_pim_viewMyDetails"));
		myinfo.click();
		//personal details
		WebElement personaldetail=driver.findElement(By.className("selected"));
		personaldetail.click();
		
		//full name
		WebElement firstname=driver.findElement(By.id("personal_txtEmpFirstName"));
		firstname.sendKeys("mira");
		WebElement middlename=driver.findElement(By.id("personal_txtEmpMiddleName"));
		middlename.sendKeys("k");
		WebElement lastname=driver.findElement(By.id("personal_txtEmpLastName"));
		lastname.sendKeys("h");
		
		//emp id
		WebElement empid=driver.findElement(By.id("personal_txtEmployeeId"));
		empid.sendKeys("123");
		//other id
		WebElement otherid=driver.findElement(By.id("personal_txtOtherID"));
		otherid.sendKeys("123Abc");
		//Driver's License Number 
		WebElement driverlicense=driver.findElement(By.id("personal_txtLicenNo"));
		driverlicense.sendKeys("123Abcd");
		//License Expiry Date
		WebElement driverlicenseexp=driver.findElement(By.id("personal_txtLicExpDate"));
		driverlicenseexp.sendKeys("123Abcd");
		//personal_txtNICNo
		WebElement driverlicenseexp=driver.findElement(By.id("personal_txtNICNo"));
		driverlicenseexp.sendKeys("123Abcd");
		
		*/
		
		
		

	}

}
