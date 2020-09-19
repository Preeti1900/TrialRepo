import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUP {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		
		String parentWind = it.next();
		String childWin = it.next();
		driver.switchTo().window(childWin);
		driver.close();
		driver.switchTo().window(parentWind);
		driver.quit();
		
	}
}
