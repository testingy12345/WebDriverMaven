import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");	
		driver=new ChromeDriver();
		
	}
	@Test
	public void doLogin() throws InterruptedException {
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("trainer@way2automation.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sdfdsf");
		
		
	}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
