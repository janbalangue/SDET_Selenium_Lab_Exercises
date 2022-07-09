package lab2all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L2E3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		System.out.println(driver.getPageSource());
		
		driver.close();
	}

}
