package lab3all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L3E2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		// css selector for Google search box
		WebElement element = driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
	
		System.out.println(element.toString());
		
		// close driver
		driver.close();
	}

}
