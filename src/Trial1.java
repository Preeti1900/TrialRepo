import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
public class Trial1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("awesome");
		driver.findElement(By.xpath("//*[@id=\"gsr\"]")).click();
		
	
			
		
		
}
}
