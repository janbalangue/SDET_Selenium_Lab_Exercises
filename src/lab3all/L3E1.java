package lab3all;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L3E1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		// xpath for Google search box
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		
		// following lines are unrelated to lab exercise
		element.sendKeys("DevLabs Alliance" + Keys.RETURN);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
