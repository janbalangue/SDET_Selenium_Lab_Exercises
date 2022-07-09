package lab3all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L3E3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.cssSelector("#email"));
		
		WebElement password = driver.findElement(By.cssSelector("#pass"));
		
//		This line doesn't work but shows the css selector for the login button
//		WebElement loginButton = driver.findElement(By.cssSelector("#u_0_5_Z9"));
		
		System.out.println(username.getTagName());
		System.out.println(password.getTagName());
				
		driver.close();
	}

}
