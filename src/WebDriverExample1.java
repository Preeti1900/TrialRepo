//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

	
public class WebDriverExample1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:/Selenium/geckodriver.exe");
		
		//FirefoxDriver driver =  new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		

		/*driver.get("http://www.google.com");
		WebElement drvr1= driver.findElement(By.name("q"));
		drvr1.clear();
		drvr1.getTagName();
		drvr1.sendKeys("Selenium");
		//CharSequence[] Sel = 'Selenium';
		//drvr1.sendKeys(Sel);
		
		drvr1.submit();
		System.out.println("Page title is: "+driver.getTitle());
		driver.quit();
		*/
		String baseUrl = "http://www.facebook.com";
        String tagName = "";
        String tagName1 = "";
        driver.get(baseUrl);
        //tagName = driver.findElement(By.className("inputtext")).getTagName();
        System.out.println(tagName+"answer");
        //driver.findElement(By.id("email")).sendKeys("preeti");
        //driver.findElement(By.id("pass")).sendKeys("jain");
        
        //driver.findElement(By.xpath(".//*html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[3]/label[1]/input[1]")).click();
      // driver.findElement(By.id("u_0_b")).click();
        /*tagName1 = driver.findElement(By.id("email")).getAttribute("class");
        System.out.println(tagName1);
        driver.close();
        System.exit(0);*/

        //driver.close();
        //System.exit(0);
        System.out.println("a");

	}

}
