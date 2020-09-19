import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:/Preeti/trial.txt");
	}
}
