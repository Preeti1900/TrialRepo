import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
public class TrialTestNG1 {
	WebDriver driver;
	@Test(priority=1, enabled=false)
	void initialiaztion(){
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		String expectedTitle = "Google";
		//if (actualTitle.equals(expectedTitle)) System.out.println("correct page");
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Tester");
		driver.findElement(By.className("gNO89b")).click();
		Boolean flag=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).isDisplayed();
		String s1=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
		System.out.println(s1);
		//if (flag)System.out.println("correct page");
		Assert.assertTrue(flag);		
	}
	@Test(priority=2, expectedExceptions = ArithmeticException.class)
	void calculate() {
		int k=50/0;
		
	}
	@Test (priority=3,enabled=false)
	void terminate() {
		driver.close();		
	}	
}
