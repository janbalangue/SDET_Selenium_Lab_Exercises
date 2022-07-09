package lab4all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L4E1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/Caskroom/chromedriver/103.0.5060.53/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://janbalangue.github.io/Hangman/");

		WebElement element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/div/input"));
		
		element.sendKeys("abcdefghijkl");
		
		// handle simple alert
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		// handle prompt alert
		// driver.switchTo().alert().sendKeys("sample text");
		
		// handle confirmation alert two ways
		// driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		
		
		
		driver.close();
	}

}
