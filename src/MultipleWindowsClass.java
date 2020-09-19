import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		String mainWin = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String childWin = it.next();
			if (!mainWin.equals(childWin)) {
				driver.switchTo().window(childWin);
				driver.close();
			}
		}
		driver.switchTo().window(mainWin);
	}	
}
