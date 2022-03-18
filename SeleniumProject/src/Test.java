import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.crome.driver","F:\\\\kanchan\\\\workspace\\\\classpractice\\\\src\\\\StringPackage\\\\SeleniumProject\\\\Resources\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/login");
		System.out.println(driver.getTitle());
		 driver.navigate().refresh();
	}

}
