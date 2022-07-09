package lab4all;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L4E2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.devlabsalliance.com/");
		
		((JavascriptExecutor) driver).executeScript("window.open('https://lms.devlabsalliance.com/#login')");
		
		((JavascriptExecutor) driver).executeScript("window.open('https://www.devopsuniversity.org/')");
		
		Set<String> set = driver.getWindowHandles();

		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			
			String window = iterator.next();
			driver.switchTo().window(window);
		}
		
		driver.close();
	}

}
